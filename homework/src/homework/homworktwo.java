package homework;

public class homworktwo {
	    // 수 3개의 합을 구하는 메소드
	
	    public static int sum(int num1, int num2, int num3) {
	        return num1 + num2 + num3;
	    }
	    
	    // 수 3개의 평균을 구하는 메소드
	    public static double avg(int num1, int num2, int num3) {
	        return (num1 + num2 + num3) / 3.0;
	    }

	    public static void main(String[] args) {
	        int result = sum(30,40,50); 
	        System.out.println("합: " + result);
	        
	        double res = avg(30,40,50); 
	        System.out.println("평균: " + res);
	    }
	}
