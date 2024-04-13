package homework;

public class math8 {
    public static void main(String[] args) {
    	 //1부터 n까지 덧셈을 재귀함수 사용해서 구현, 시간복잡도 구하기
         
        System.out.println(sum(10));
    }
    
    static int sum(int n) {
        if (n == 1) {
        	return 1;	
        } 
        return n + sum(n - 1); 
    }
}


/* 
 * 기본 조건: n이 1일 때, 1을 반환
 * 
 * n + (n-1)까지의 합을 구함 
 * 
 * 재귀함수를 호출하여 결과를 출력
 * 
 *
 */
