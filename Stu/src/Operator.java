import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 82p
		System.out.println("정수를 입력하시오 : ");

		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간  ");
		System.out.print(minute + "분 , ");
		System.out.println(second + " 초 입니다. ");
		sc.close();
		
	}

}
