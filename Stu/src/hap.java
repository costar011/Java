import java.util.Scanner;

public class hap {

	public static int sum(int x, int y, int z) {
		return (x+y+z);

	}
	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		int z = 30;
		
		int i;
		int j = 0;
		
		int sum = x+y+z;
		double avg = (x+y+z)/3;
		
		i = sum(x, y, z);
		
		System.out.println(x + "  " + y + "  " + z + " " +  "합 : " + sum);
		System.out.println(x + "  " + y + "  " + z + " " + "평균 :" + avg);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 쓰시오 >>> ");
		j = sc.nextInt();
		
		if(j % 2 == 0) {
			System.out.println("짝수 입니다 ");
		} else {
			System.out.println("홀수 입니다 ");
		}
	}

}
