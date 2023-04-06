import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// 79p 
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하시오 ");
		
		String name = sc.next();
		System.out.print("이름은 " + name + " , ");
		
		String city = sc.next();
		System.out.print("도시는 " + city + " , ");
		
		int age = sc.nextInt();
		System.out.print("나이는 " + age +"  살 ,  ");
		
		double weight = sc.nextDouble();
		System.out.print("체중은 " + weight +"kg," );
		
		boolean isSingle = sc.nextBoolean();
		System.out.println("독신 여부는 "+ isSingle + "입니다 ");
		sc.close();

	}

}


