import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		// 정수 두개를 입력 받아서 합을 구한다
		// 정수 두개를 입력받아서 합을 메소드를 사용해서 구한다
		// 이름을 입력받고 출력한다
		// 정수 한 개를 입력받고 홀수 인지 짝수 인지 구별한다 
		// 1에서부터 입력받은 정수까지 중 홀수만 덧셈한다
		// 1에서부터 입력받은 정수 3의 배수의 개수를 출력한다 
		
		int a = 0;
		int b = 0;
		int hap;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하시오  >>> ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		hap = a + b;
		
		System.out.println( a + " " + b + " 의 합: " + hap);
		
		System.out.print("정수 한개를 입력하시오  >>>>");
		int c = 0;
		
		c = sc.nextInt();
		
		if(c % 2 == 0) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
		}
		
		for(int i = 0; i < 100; i++) {
			if ((i + 1) % 2 != 0) {
				hap = hap + (i + 1);
			}
		}
		
		
		System.out.println("1부터 100까지의 홀수의 합은 " + hap + " 입니다");
		
		if(c % 3 == 0) {
			System.out.println(c + "은 배수 입니다 ");
		} else {
			System.out.println(c + "은 배수가 아닙니다 ");
		}

	}

}
