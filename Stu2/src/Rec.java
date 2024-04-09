
public class Rec {

   public static int sum(int n) {
      int i;
      int result = 0;

      for (i = 1; i <= n; i++) {
         result += i;
      }
      return result;
   }

   public static int recSum(int n) {
      if (n == 1) {
         return 1;
      }
      return n + recSum(n - 1);

   }

   public static void main(String[] args) {
      System.out.println(sum(10));
      System.out.println(recSum(5));
   }

}

//  재귀함수 