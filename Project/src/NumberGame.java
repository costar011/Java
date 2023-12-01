import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberGame extends JFrame implements ActionListener {
	private JPanel numberPanel;
	private JLabel scoreLabel;
	private JButton startButton;
	private List<JButton> numberButtons;
	private int score;
	private Timer timer;
	private int time;
	private int currentNumber;

	public NumberGame() {
		setTitle("숫자 순서대로 누르기 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);

		numberPanel = new JPanel(new GridLayout(4, 4, 10, 10));
		add(numberPanel, BorderLayout.CENTER);

		scoreLabel = new JLabel("Score: 0 | Time: 0");
		scoreLabel.setFont(new Font("Arial", Font.BOLD, 20));
		add(scoreLabel, BorderLayout.NORTH);

		startButton = new JButton("Start");
		startButton.addActionListener(this);
		add(startButton, BorderLayout.SOUTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new NumberGame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton) {
			startButton.setEnabled(false);
			score = 0;
			currentNumber = 1;
			scoreLabel.setText("Score: " + score + " | Time: 0");

			numberPanel.removeAll();
			numberButtons = new ArrayList<>();

			for (int i = 1; i <= 20; i++) {
				JButton numberButton = new JButton(String.valueOf(i));
				numberButton.setFont(new Font("Arial", Font.BOLD, 20));
				numberButton.addActionListener(this);
				numberButtons.add(numberButton);
			}

			// 숫자 버튼 랜덤으로 섞기
			Collections.shuffle(numberButtons);
			for (JButton button : numberButtons) {
				numberPanel.add(button);
			}

			revalidate();
			repaint();

			// 타이머 시작
			time = 0;

			timer = new Timer(600, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					time++;
					scoreLabel.setText("Score: " + score + " | Time: " + time);
				}
			});

			timer.start();
		} else if (numberButtons.contains(e.getSource())) {
			JButton clickedButton = (JButton) e.getSource();
			int clickedNumber = Integer.parseInt(clickedButton.getText());

			if (clickedNumber == currentNumber) {
				numberButtons.remove(clickedButton);
				numberPanel.remove(clickedButton);
				revalidate();
				repaint();

				score++;
				currentNumber++;

				scoreLabel.setText("Score: " + score + " | Time: " + time);

				if (numberButtons.isEmpty()) {
					JOptionPane.showMessageDialog(this, "게임 종료 \n 최종 점수 : " + score + "\n소요된 시간 :" + time);
					startButton.setEnabled(true);
					timer.stop();
				}
			}
		}
	}
}

/*
 * 
 * 클래스 선언: NumberGame 클래스는 JFrame을 상속받고 ActionListener 인터페이스를 구현 멤버 변수 선언 게임에
 * 필요한 컴포넌트와 변수들을 선언 numberPanel은 숫자 버튼들이 배치되는 패널이며 scoreLabel은 점수와 시간을 표시하는 라벨
 * startButton은 게임을 시작하는 버튼이고, numberButtons는 숫자 버튼들을 저장하는 리스트 score는 사용자의 점수,
 * timer는 게임의 타이머, time은 게임의 진행 시간을 나타내며, currentNumber는 사용자가 다음에 눌러야 하는 숫자를 저장
 * 
 * 
 * 생성자: 게임에 필요한 컴포넌트를 초기화하고 배치 main 메서드: NumberGame객체를 생성하여 게임을 시작
 * actionPerformed 메서드: 'Start' 버튼을 누르면, 게임을 초기화하고 숫자 버튼을 랜덤하게 배치한 후 타이머를 시작 숫자
 * 버튼을 누르면 해당 버튼을 패널에서 제거하고 점수를 올린다 다음에 눌러야 할 숫자(currentNumber)도 증가 만약 모든 버튼을
 * 눌렀다면, 게임을 종료하고 'Start' 버튼을 다시 활성화 이후, 점수와 소요 시간을 사용자에게 보여줌
 * 
 * 
 */
