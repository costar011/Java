
public class Ex03 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			
			if ((i + 1) % 2 != 0) {
				
				sum = sum + (i + 1);
			}
		}
		
		System.out.println("1부터 100까지의 홀수의 합 " + sum + " 입니다");
         
        
       
	}

}
