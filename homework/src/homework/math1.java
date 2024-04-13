package homework;

public class math1 {

	 public static void main(String[] args) {
	      //배열의 합 구하기 의사코드 작성하고 구현 및 시간복잡도 구하기
	      int[] arr = { 1,2,3,4 };
	      System.out.println(Sum(arr));
	   }

	   static int Sum(int[] arr) {
	      int Num = 0;
	      
	      for(int i = 0; i<arr.length; i++) {
	    	  Num += arr[i];
	      }
	      
	      return Num;
	   }   
}

/* 
 * 배열 정의 및 초기화
 * 함수(arr) 출력
 * 
 * Sum(함수)
 *    - Num 정의 및 0 으로 초기화 >> 배열의 합을 저장할 공간 마련
 *    - 반복문을 통해 배열의 크기만큼 반복한다
 *    
 *       1. Sum에 배열의 0번지 부터 n 번지까지 덧셈
 *    - 리턴을 통해 Num 반환 및 함수 종료
 * */
