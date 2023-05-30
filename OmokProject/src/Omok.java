import java.awt.*; //awt import
import java.awt.event.*;
import javax.swing.*;

public class Omok extends JFrame {
	GoEgg goEgg[][];
	ImageIcon img = new ImageIcon("images//empty.png"); // 보드 이미지 
	ImageIcon white = new ImageIcon("images//white.png"); // 백돌 이미지 
	ImageIcon black = new ImageIcon("images//black.png"); // 흑돌 이미지 
	ImageIcon turn = black;

	public Omok() {
		setTitle("오목"); // 게임 타이틀 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		// setDefaultCloseOperation메소드에 (EXIT_ON_CLOSE)필드 값을 붙이면 윈도우창 종료 시 프로세스까지 깔끔하게 닫을 수 있다

		Container c = getContentPane();
		c.setLayout(new GridLayout(26, 26)); // 보드 : 가로 세로

		goEgg = new GoEgg[26][]; // 배열 만들기 

		myActionListener goAction = new myActionListener(); // 스캐너 사용 
		
		for (int i = 0; i < 26; i++) { // 2중 for문 돌리기 
			goEgg[i] = new GoEgg[26];
			for (int j = 0; j < 26; j++) {
				goEgg[i][j] = new GoEgg(i, j, img);
				c.add(goEgg[i][j]);
				goEgg[i][j].addActionListener(goAction); // addActionListener : 버튼 클릭 시 동작 
				goEgg[i][j].setBorderPainted(false);
				// setBorderPainted : ImageIcon의 border(외곽선)을 없애준다
			}
		}

		setSize(1000, 1000); // 컴포넌트의 크기를 결정하는 메소드
		setVisible(true);
		// setVisible(true)값으로 설정해야 화면에 보여짐 
	}

	class myActionListener implements ActionListener {

		@Override
		// 오버라이딩 : 다른 무엇보다 더 중요한 것, 우선시되는 것
		public void actionPerformed(ActionEvent e) {
			GoEgg wi = (GoEgg) e.getSource();
			if (turn == white) {
				wi.setIcon(white);
				wi.state = "W";
				turn = black; // 첫번째 흑돌 

			} else {
				wi.setIcon(black);
				wi.state = "B";
				turn = white; // 두번째 백돌 
			}
			checkWin(wi);
			wi.removeActionListener(this); // 승패 비교 
		}

	}

	public void checkWin(GoEgg e) { 
		// 메소드 checkWin
		// 해당 메소드는 GoEgg 클래스의 인스턴스를 매개변수로 받는다 
		// 게임 로직에서 승리 여부를 확인하는 역할
		
		int checkx = e.x;
		int checky = e.y;
		int count = 0;
		
		while (checky >= 0 && goEgg[checkx][checky].state.equals(e.state)) {
			checky -= 1;
		}
		
		checky += 1;
		
		while (checky < 26 && goEgg[checkx][checky].state.equals(e.state)) {
			checky += 1;
			count++;
		}
		
		if (count == 5) {
			if (e.state.equals("B")) {
				JOptionPane.showMessageDialog(null, "흑돌 승리", "사용자1", JOptionPane.QUESTION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "백돌 승리", "사용자2", JOptionPane.QUESTION_MESSAGE);
			}

		}
		
		/*
		 * 
		 * int checkx = e.x;와 int checky = e.y;는 GoEgg 인스턴스 e의 x와 y 값을 각각 checkx와 checky 변수에 복사
		 * 이 위치에서 승리 여부를 확인할 돌의 위치를 나타냄
		 * int count = 0;은 돌이 연속으로 나오는 횟수를 세기 위한 변수
		 * while (checky >= 0 && goEgg[checkx][checky].state.equals(e.state))는 현재 위치에서 위로 이동하면서 돌의 상태가 e.state와 동일한지 확인
		 
		 * 이동하면서 count를 증가시키지 않고, 체크 위치를 한 칸씩 위로 올리고 같은 돌의 연속이 어디에서 끊기는지 파악
		 * 첫 번째 while 루프가 끝나면 checky는 연속된 돌의 위쪽 경계를 나타냄 checky += 1;을 통해 한 칸 아래로 이동
		 * while (checky < 26 && goEgg[checkx][checky].state.equals(e.state))는 현재 위치에서 아래로 이동하면서 돌의 상태가 e.state와 동일한지 확인
		 * 이동하면서 count를 증가시키고, 체크 위치를 한 칸씩 아래로 내림 같은 돌의 연속이 어디에서 끊기는지 파악
		 * 두 번째 while 루프가 끝나면 checky는 연속
		 * 
		 * */
		
		/////////////////////////////////
		
		// 가로 방향으로 오목 승리 조건을 확인하는 로직
		/*
		 * checkx = e.x;와 checky = e.y;는 GoEgg 인스턴스 e의 x와 y 값을 checkx와 checky 변수에 복사합니다. 이 위치에서 승리 조건을 확인할 돌의 위치를 나타냄 
		 * count = 0;은 돌이 연속으로 나오는 횟수를 세기 위한 변수
		 * 첫 번째 while 루프에서 checkx를 하나씩 왼쪽으로 이동하면서,goEgg[checkx][checky].state.equals(e.state) 조건을 만족하는 동안 계속 반복
		 * 이렇게 함으로써 같은 돌의 연속이 어디에서 끊기는지 파악한 후 checkx가 왼쪽 경계를 벗어나거나, 돌의 상태가 e.state와 다르면 루프를 종료
		 * while 루프가 끝나면 checkx는 연속된 돌의 왼쪽 경계를 나타낸 후 checkx += 1;을 통해 한 칸 오른쪽으로 이동
		 * 두 번째 while 루프에서 checkx를 하나씩 오른쪽으로 이동하면서, goEgg[checkx][checky].state.equals(e.state) 조건을 만족하는 동안 계속 반복
		 * 이렇게 함으로써 같은 돌의 연속이 어디에서 끊기는지 파악하고 checkx가 오른쪽 경계를 벗어나거나, 돌의 상태가 e.state와 다르면 루프를 종료 및 동시에 count 변수를 증가
		 * 
		 * */
		
		checkx = e.x;
		checky = e.y;
		count = 0;

		while (checkx >= 0 && goEgg[checkx][checky].state.equals(e.state)) {
			checkx -= 1;
		}
		checkx += 1;
		while (checkx < 26 && goEgg[checkx][checky].state.equals(e.state)) {
			checkx += 1;
			count++;
		}
		if (count == 5) {
			if (e.state.equals("B")) {
				JOptionPane.showMessageDialog(null, "흑돌 승리", "사용자1", JOptionPane.QUESTION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "백돌 승리", "사용자2", JOptionPane.QUESTION_MESSAGE);
			}
		}
		
		////////////////////
		
		checkx = e.x;
		checky = e.y;
		count = 0;

		while (checkx >= 0 && checky >= 0 && goEgg[checkx][checky].state.equals(e.state)) {
			checkx -= 1;
			checky -= 1;
		}
		checkx += 1;
		checky += 1;
		while (checkx < 26 && checky < 26 && goEgg[checkx][checky].state.equals(e.state)) {
			checkx += 1;
			checky += 1;
			count++;
		}
		if (count == 5) {
			if (e.state.equals("B")) {
				JOptionPane.showMessageDialog(null, "흑돌 승리", "사용자1", JOptionPane.QUESTION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "백돌 승리", "사용자2", JOptionPane.QUESTION_MESSAGE);
			}

		}
		//		//////////////////
		
		// 오목 게임에서 특정 돌(e)의 주변에 있는 돌들을 체크하여 연속된 5개의 돌이 있는지 확인하고, 승리 여부를 판단하는 부분
		checkx = e.x;
		checky = e.y;
		count = 0;

		while (checkx >= 0 && checky < 26 && goEgg[checkx][checky].state.equals(e.state)) {
			checkx -= 1;
			checky += 1;
		}
		checkx += 1;
		checky -= 1;
		while (checkx < 26 && checky >= 0 && goEgg[checkx][checky].state.equals(e.state)) {
			checkx += 1;
			checky -= 1;
			count++;
		}

		if (count == 5) {
			if (e.state.equals("B")) {
				JOptionPane.showMessageDialog(null, "흑돌 승리", "사용자1", JOptionPane.QUESTION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "백돌 승리", "사용자2", JOptionPane.QUESTION_MESSAGE);
			}

		}

	}

	public static void main(String[] args) {
		new Omok(); // 오목 갖고오기 
	}
}

class GoEgg extends JButton {
	int x;
	int y;
	String state;

	public GoEgg(int x, int y, ImageIcon image) {
		super(image);
		this.x = x;
		this.y = y;
		state = "A";
	}
}