import javax.swing.*;


class MyFrame extends JFrame {
	public MyFrame() { // 생성자 
		setTitle("첫번째 프레임 만들기 "); // 프레임 제목 
		setSize(300,300); // 프레임 크기 
		setVisible(true); // 보이기 속성 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료
	}
}


public class FrameEx {

	public static void main(String[] args) {
		MyFrame mf = new MyFrame(); // 객체 생성과 실행 

	}

}
