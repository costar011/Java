package homework;

public class math2 {
   public static void main(String[] args) {
      //배열에서 홀수만 덧셈하기 의사코드 작성하고 구현 및 시간복잡도 구하기
      int[] arr = { 1,2,3,4,5 };
      
      System.out.println(sumEven(arr));
   }
   static int sumEven(int[] arr) {
      int arrSum = 0;
      
      for(int i = 0; i<arr.length; i++) {
         if (arr[i] % 2 == 0) {
            arrSum += arr[i];
         }
      }
      
      return arrSum;
   }
}