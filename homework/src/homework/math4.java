package homework;

public class math4 {
    public static void main(String[] args) {
    	
    	// 배열에서 가장 큰 수 구하기 의사코드 작성하고 구현 및 시간복잡도 구하기
    	
        int[] arr = {1,3,5,7,9,2,4,6,8}; 
        int maxValue = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) { 
                maxValue = arr[i]; // maxValue 업데이트
            }
        }
        
        System.out.println("가장 큰 수: " + maxValue); // 가장 큰 수 출력, 출력값: 9
    }
}


/* 
 * 정수형 배열 arr
 * 
 * 가장 큰 수를 저장할 변수 maxValue를 배열의 첫 번째 요소로 초기화
 *  
 *  배열 arr을 순회하는 반복문을 시작
 * 
 * 만약 현재 요소가 maxValue보다 크다면, maxValue를 현재 요소로 업데이트
 * 
 * 모든 요소의 순회가 끝나면, maxValue를 출력
 * 
 * */