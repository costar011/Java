package homework;

public class math5 {
    public static void main(String[] args) {
    	// 배열에서 가장 작은 수 구하기 의사코드 작성하고 구현 및 시간복잡도 구하기
    	
        int[] arr = {8,5,2,1,6,9,3}; 
        int min = arr[0]; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { 
            	min = arr[i]; 
            }
        }
        
        System.out.println("가장 작은 수: " + min); 
    }
}



/* 
 * 정수형 배열 arr
 * 
 * 가장 작은 수를 저장할 변수 min 를 배열의 첫 번째 요소로 초기화
 *  
 *  배열 arr을 순회하는 반복문을 시작
 * 
 * 만약 현재 요소가 min보다 작다면, min를 현재 요소로 업데이트
 * 
 * min를 출력
 * */