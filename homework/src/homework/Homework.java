package homework;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		// 1 . 사용자로부터 정수를 입력받아, 그 수가 양수인지, 음수인지, 아니면 0인지를 판별하는 프로그램을 작성하세요.
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("정수를 입력하세요: ");
        
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("양수입니다.");
            
        } else if (number < 0) {
            System.out.println("음수입니다.");
            
        } else {
            System.out.println("0입니다.");
        }
        
        // 2. 사용자로부터 두 개의 정수를 입력받아, 두 수 중에서 큰 수를 출력하는 Java 프로그램을 작성하세요.
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = s.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = s.nextInt();

        if (num1 > num2) {
            System.out.println("더 큰 수는 " + num1 + "입니다.");
            
        } else if (num2 > num1) {
            System.out.println("더 큰 수는 " + num2 + "입니다.");
            
        } else {
            System.out.println("두 수는 같습니다.");
        }
        
        // 3. 점수가 60점 이상이라면 합격 판별을 하는 프로그램 작성세요.
        
        Scanner c = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요 : ");
        
        int score = c.nextInt();
        
        if (score >= 60) {
        	System.out.println("합격입니다");
        }

	}

}
