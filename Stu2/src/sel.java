
public class sel {

   public static void main(String[] args) {
      int[] arr = { 9, 6, 7, 3, 5 };

      for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            // 자기 자신과 비교할 필요가 없기 때문에 +1을 한다

            if (arr[i] > arr[j]) {
               int index = arr[i];

               arr[i] = arr[j]; // arr[i]에 있는 값을 arr[j]에 넣는다

               arr[j] = index; // 위를 보면 index = arr[i] 였지만 지금은 arr[j]기 때문에 arr[j]의 값이 index로 들어온 것
            }
         }
      }

      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }

}