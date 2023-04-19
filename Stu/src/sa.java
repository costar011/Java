import java.util.Scanner;

public class sa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1
		int a, b, c = 0;
		
		System.out.print("정수 3개를 쓰시오 >>> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int hap = a+b+c;
		System.out.println("3정수의 합 :" + hap);
		
		double avg = a+b+c/3;
		System.out.println("3정수의 평균 :" + avg);
		
		System.out.println();
		
		// 2
		System.out.print("정수 1개를 입력하시오 >>> ");
		
		int d = sc.nextInt();
		
		if(d % 2 == 0) {
			System.out.println("입력한 값은 짝수 입니다 ");
		} else {
			System.out.println("입력한 값은 홀수 입니다 ");
		}
		
		System.out.println();
		
		// 다른문제 
		int arr[] = new int[5];
		
		arr[0] = 2;
		arr[1] = -5;
		arr[2] = 7;
		arr[3] = 1;
		arr[4] = 3;
		
		int max = 0;
		int min = 0;
		System.out.print("양수 5개를 입력하세요 >>> ");
		
		for(int i = 0; i< arr.length; i ++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
	
		
		System.out.println("가장 큰 수는 " + max + "입니다 ");
		System.out.println("가장 작은 수는 " + min + "입니다 ");
		
	}

}
