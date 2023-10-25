public class Method{
   
    public static int Sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double Ave(int[] arr) {
      
        int sum = Sum(arr);
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = Sum(numbers);
        double ave = Ave(numbers);

        System.out.println("배열의 합은: " + sum +"입니다.");
        System.out.println("배열의 평균: " + ave +"입니다,");
    }
}
