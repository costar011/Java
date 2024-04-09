
public class Rec2 {
   public static int Sum(int a, int b) {
      if (a == b) {
         return a;
      }
      if (a > b) {
         return 0;
      }

      int avg = (a + b) / 2;

      return Sum(a, avg) + Sum(avg + 1, b);
   }

   public static void main(String[] args) {
      System.out.println(Sum(2, 5));
   }

}