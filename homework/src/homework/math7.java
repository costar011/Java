package homework;

public class math7 {

	   public static void main(String[] args) {
	      //배열에서 큰 수를 분할 정복을 사용해서 구하기 의사코드 작성하고 구현
	      int[] arr = { 1,2,3,74,6,7,8,65,43,2,31 };
	      
	      System.out.println(BinaryTree(arr,0,10));
	   }
	   
	   static int BinaryTree(int[] arr , int s, int e) {
	      // 조건문 1 - 중간 원소가 1개
	      if (s == e) {
	         return arr[s];
	      }
	      // 조건문 2 - 중간 원소가 2개
	      else if (s+1 == e) {
	         return Math.max(arr[s], arr[e]);
	      }
	      // 조건문 3 - 중간 원소가 3개이상
	      int mid = s + (e - s) / 2;
	      return Math.max(BinaryTree(arr,s,mid), BinaryTree(arr,mid+1,e));
	   }
	}