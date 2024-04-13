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
 * 
 * Num 정의 및 0 으로 초기화
 * 반복문을 통해 배열의 크기만큼 반복
 *    
 * Sum에 배열의 0번지 부터 n 번지까지 덧셈
 *  sNum 반환 및 함수 종료
 * */
