import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class carGameAA extends JFrame {
	JLabel la1 = new JLabel("A");
	JLabel la2 = new JLabel("B");
	JLabel la3 = new JLabel("C");
	
	MyThreadA th1 = new MyThreadA(la1);
	MyThreadA th2 = new MyThreadA(la2);
	MyThreadA th3 = new MyThreadA(la3);
	
	JButton bt1 = new JButton("START");
	
	public carGameAA() {
		setTitle("CarRace");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,300);
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		
		la1.setSize(100,50);
		la2.setSize(100,50);
		la3.setSize(100,50);
		bt1.setSize(100,50);
		
		la1.setLocation(50,0);
		la2.setLocation(50,50);
		la3.setLocation(50,100);
		bt1.setLocation(50,200); // 50 <- X , 200 <- Y

		
		c.add(la1);
		c.add(la2);
		c.add(la3);
		c.add(bt1);
		
		th1.start();
		th2.start();
		th3.start();
	}
}

class MyThreadA extends Thread {
	private JLabel label;
	private int ix,iy;
	
	public MyThreadA(JLabel la) {
		label = la;
	}
	
	public void run() {
		ix = label.getX();
		iy = label.getY();
		
		for(int i = 0; i < 200; i++) {
			ix += 10 * Math.random();
			label.setLocation(ix,iy);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}


public class GameAA {

	public static void main(String[] args) {
		new carGameAA();
	}

}
