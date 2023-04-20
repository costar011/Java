import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// Exam 4 // 133p
		
		Scanner sc = new Scanner(System.in);
		
		int intArry[] = new int[5];
		
		int max = 0;
		
		System.out.print("양수 5개를 입력하세요 : ");
		
		for(int i = 0; i < 5; i++) {
			intArry[i] = sc.nextInt();
			if(intArry[i] > max) {
				max = intArry[i];
			}
		}
		
		System.out.print("가장 큰 수는 " + max + "입니다");

	}

}
