package homework;

import java.util.Random;

/*

	두 수를 더하는 메소드 의사 코드
	메소드 명세
	입력: 두 개의 정수 (a, b)
	처리: a와 b를 더함
	출력: 두 수의 합
	
*/

public class homeworkfive {
	public static void main(String[] args) {
		Random random = new Random();

		
		int num1 = random.nextInt(100); 
		int num2 = random.nextInt(100); 

		
		int sum = add(num1, num2);

		System.out.println(num1 + " + " + num2 + " = " + sum);
	}

	
	public static int add(int a, int b) {
		return a + b;
	}
}
