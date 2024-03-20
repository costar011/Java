
public class Mul {

	public static void main(String[] args) {
		for(int i = 0; 12 < i; i++) {
			if((i + 1) % 2 == 0) {
				System.out.println("12의 최대공약수 :" + (i + 1));
			}
		}
		
		for(int i = 0; 12 < i; i++) {
			for(int j = 0; 6 < j; j++) {
				if((j + 1) % 2 == 0 && (j+1) % 2 == 0) {
					System.out.println("6과 12의 최대공약수 :" + (j + 1));
				}
			}
		}
	}
}
