package homework;

public class math3 {
    public static void main(String[] args) {
    	
    	//배열에서 짝수만 덧셈하기 의사코드 작성하고 구현 및 시간복잡도 구하기
    	
        int[] arr = {4,3,1,5,2}; 
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
 * 배열 arr을 정의
 * 
 * 저장할 변수 sum을 0으로 초기화
 * 
 *  배열 arr을 순회하는 반복문을 시작
 *  
 * 만약 현재 요소가 짝수라면, sum에 현재 요소를 더함
 * 
 * 모든 요소의 순회가 끝나면, sum을 출력
 * 
 * */