import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class JDBC_Frame extends JFrame {
	Statement stmt = null;
	Connection conn = null;
	ResultSet srs;

	JButton btNext = new JButton("다음");

	JTextField txtName = new JTextField();

	JLabel laName = new JLabel("이름");

	String name;

	MyActionNext lis = new MyActionNext();

	public JDBC_Frame() {
		setTitle("JDBC Ex");
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		add(btNext);
		btNext.setSize(70, 30);
		btNext.setLocation(110, 20);

		laName.setFont(new Font("Gothic", Font.ROMAN_BASELINE, 20));

		add(txtName);
		txtName.setSize(100, 30);
		txtName.setLocation(150, 80);

		laName.setFont(new Font("Gothic", Font.ROMAN_BASELINE, 20));
		add(laName);
		txtName.setSize(100, 30);
		txtName.setLocation(100, 80);

		btNext.addActionListener(lis);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student?serverTimezone=Asia/Seoul&useSSL=false", "root", "1111");
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();

			ResultSet srs = stmt.executeQuery("select * from student");

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

	class MyActionNext implements ActionListener {
		public void  actionPerformed(ActionEvent e) {
			try {
				if (srs.next()) {
					name = srs.getString("name");
				} else {
					txtName.setText("END");
				} catch (SQLException e1) {
					System.out.println("SQL error");
				}
			} 
		}
	}
}

public class Java {

	public static void main(String[] args) {
		new JDBC_Frame();

	}

}
