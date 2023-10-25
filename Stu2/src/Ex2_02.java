import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;
import java.awt.Toolkit;

class ButtonEx extends JFrame {
	private JButton bt1 = new JButton("버튼1");
	private JPanel pa = new JPanel();
	
	ButtonEx() {
		setTitle("버튼 연습");
		setSize(300,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		pa.setBackground(Color.green);
		add(pa);
		pa.add(bt1);
		pa.add(new JButton("Buton"));
	}
}



public class Ex2_02 {

	public static void main(String[] args) {
		ButtonEx ob = new ButtonEx();

	}

}
