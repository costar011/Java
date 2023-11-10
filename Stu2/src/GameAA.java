import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class CarGameAA extends JFrame {
	JLabel la1 = new JLabel("A");
	JLabel la2 = new JLabel("B");
	JLabel la3 = new JLabel("C");

	MyThreadA th1 = new MyThreadA(la1);
	MyThreadA th2 = new MyThreadA(la2);
	MyThreadA th3 = new MyThreadA(la3);

	JButton bt1 = new JButton("START");
	JButton bt2 = new JButton("STOP");
	
	
	JLabel resultLabel = new JLabel("들어온 순위 결과 값");
	JLabel res = new JLabel();

	public CarGameAA() {
		setTitle("CarRace");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		setVisible(true);

		Container c = getContentPane();
		c.setLayout(null);

		la1.setSize(100, 50);
		la2.setSize(100, 50);
		la3.setSize(100, 50);

		bt1.setSize(100, 50);
		bt2.setSize(100, 50);
		resultLabel.setSize(300, 50);

		la1.setLocation(50, 0);
		la2.setLocation(50, 50);
		la3.setLocation(50, 100);

		bt1.setLocation(50, 200);
		bt2.setLocation(200, 200);
		resultLabel.setLocation(50, 150);

		c.add(la1);
		c.add(la2);
		c.add(la3);
		c.add(bt1);
		c.add(bt2);
		c.add(resultLabel);

		bt1.addActionListener(new MyAction());
		bt2.addActionListener(new MyAction());
	}

	class MyAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == bt1) { // START 버튼 클릭
				th1.start();
				th2.start();
				th3.start();
				
			} else if (e.getSource() == bt2) { // STOP 버튼 클릭
				th1.interrupt();
				th2.interrupt();
				th3.interrupt();
			}
		}
	}
}

class MyThreadA extends Thread {
	private JLabel label;
	private int ix, iy;
	private static int rank = 1;

	public MyThreadA(JLabel la) {
		label = la;
	}

	public void run() {
		ix = label.getX();
		iy = label.getY();

		for (int i = 0; i < 200; i++) {
			ix += 10 * Math.random();

			if (ix > 500) {
				ix = 500;
				
				
			}
			label.setLocation(ix, iy);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class GameAA {
	public static void main(String[] args) {
		new CarGameAA();
	}
}
