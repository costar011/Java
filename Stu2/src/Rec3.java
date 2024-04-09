
public class Rec3 {
   public static int fac(int a) {
      int res;
      if (a <= 1) {
         return 1;
      } else {
         res = a * fac(a - 1);
         return res;
      }
   }

   public static void main(String[] args) {
      System.out.println(fac(4));

   }

}