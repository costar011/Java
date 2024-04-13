package homework;

public class math3 {
    public static void main(String[] args) {
    	
    	//배열에서 짝수만 덧셈하기 의사코드 작성하고 구현 및 시간복잡도 구하기
    	
        int[] arr = {4, 3, 1, 5, 2}; 
        int sum = 0; 
        
        for (int i : arr) {
            if (i % 2 == 0) { 
                sum += i; 
            }
        }
        
        System.out.println(sum); 
    }
}


/* 
 * 
 * 
 * 
 *  
 *  
 * 
 * 
 * */