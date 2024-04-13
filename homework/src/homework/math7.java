package homework;

public class math7 {

	   public static void main(String[] args) {
	      //배열에서 큰 수를 분할 정복을 사용해서 구하기 의사코드 작성하고 구현
	      int[] arr = { 1,3,4,56,77,22,81,97,56,10,82 };
	      
	      System.out.println(BinaryTree(arr,0,10));
	   }
	   
	   static int BinaryTree(int[] arr , int a, int b) {
	      // 조건문 1 - 중간 원소가 1개
	      if (a == b) {
	         return arr[a];
	      }
	      // 조건문 2 - 중간 원소가 2개
	      else if (a+1 == b) {
	         return Math.max(arr[a], arr[b]);
	      }
	      // 조건문 3 - 중간 원소가 3개이상
	      int avg = a + (b - a) / 2;
	      return Math.max(BinaryTree(arr,a,avg), BinaryTree(arr,avg+1,b));
	   }
	}

/* 
 * 배열 arr과 인덱스 a, b를 입력으로 받는 BinaryTree 함수를 정의
 * 
 * 만약 a와 b가 같다면, arr[a]를 반환 (조건문 1 - 중간 원소가 1개)
 * 
 * 만약 a+1이 b와 같다면, arr[a]와 arr[b] 중 더 큰 값을 반환 (조건문 2 - 중간 원소가 2개
 * 
 * 그렇지 않다면, a와 b의 평균값을 avg로 계산 (조건문 3 - 중간 원소가 3개 이상)
 * 
 * BinaryTree 함수를 재귀적으로 호출하여, arr[a]부터 arr[avg]까지의
 * 최대값과 arr[avg+1]부터 arr[b]까지의 최대값 중 더 큰 값을 반환
 * 
 * 주어진 배열 arr에 대해 BinaryTree 함수를 호출하고, 결과를 출력
 * 
 * */

