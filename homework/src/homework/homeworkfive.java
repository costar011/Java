package homework;
import java.util.Random;
import java.util.Scanner;

public class homeworkfive {
	
   public static int A (int[] array) {
      int max = 0;
      int max2 = 0;
      int min = 9999;
      
      for (int i = 0;i<array.length; i++) {
         if (max < array[i]) {
            max2 = max;
               
            max = array[i];
         }
         else if ( max > array[i] && max2 < array[i]) {
            max2 = array[i];
         }
         
         if (min > array[i]) {
            min = array[i];
         }
      }
      
      System.out.println(array.length+"크기인 정수배열 가장 작은 수 : "+min);
      System.out.println(array.length+"크기인 정수배열 두번째로 큰 수 : "+max2);
      
      return max2;
   }
   
   
   public static void main(String[] args) {
      Random ran = new Random();
      Scanner sc = new Scanner(System.in);
      
      System.out.print("배열의 크기 설정 : ");
      int[] arr = new int[sc.nextInt()];
      
      for (int i = 0; i<arr.length; i++) {
         arr[i] = ran.nextInt(100);
         System.out.print(arr[i]+"\t");
      }
      System.out.println();
      
      A(arr);
   }
}