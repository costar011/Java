package homework;
import java.util.Scanner;

public class homeworkthree {
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int[] arr = new int[10]; 
	    
	    System.out.print("10개의 숫자를 입력하세요 : ");

	    for(int i = 0; i < arr.length; i++) {
	        arr[i] = sc.nextInt(); 
	    }

	    for(int i = 0; i < arr.length; i++) {
	    }

	    int evenSum = 0; 
	    
	    for(int i = 0; i < arr.length; i++) {
	        if(arr[i] % 2 == 0) { 
	            evenSum += arr[i]; 
	        }
	    }
	    
	    int Ve = 0;
	    
	    for(int i = 0; i < arr.length; i++) {
	    	if(arr[i] % 3 == 0) {
	    		Ve = arr[i];
	    	}
	    }
	    
	    System.out.println("짝수 합: " + evenSum); 
	    System.out.println("3의 배수 :" + Ve);

	    sc.close(); 
	}

}


