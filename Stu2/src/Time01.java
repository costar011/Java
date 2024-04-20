
public class Time01 {

	// 시간 복잡도

	public static int evenSum(int arr[], int n) {
		int cnt = 0;
		int sum = 0;

		cnt++;

		for (int i = 0; i < arr.length; i++) {
			cnt++;
			cnt++;
			if (arr[i] % 2 == 0) {
				sum += arr[i];
				cnt++;
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		System.out.println("배열 짝수합 시간복잡도 W(n) = 4n + 1");

		System.out.println("배열 짝수합 시간복잡도 B(n) = 2n + 1");

		System.out.println("배열 짝수합 시간복잡도 A(n) = 3n + 1");

		System.out.println("n = 7 : W(n) = 13, B(n) = 7, A(n) = 10 ");
		
		System.out.println();

		int arrEvenSum[][] = { { 1, 1, 1, 1, 1, 1, 1 }, { 2, 1, 1, 1, 1, 1, 1 }, { 2, 2, 1, 1, 1, 1, 1 },
				{ 2, 2, 2, 1, 1, 1, 1 }, { 2, 2, 2, 2, 1, 1, 1 }, { 2, 2, 2, 2, 2, 1, 1 }, { 2, 2, 2, 2, 2, 2, 1 },
				{ 2, 2, 2, 2, 2, 2, 2 } };
		
		System.out.println();

		System.out.println("배열 짝수합 시간복잡도 W(n) = 4n + 1");

		System.out.println("배열 짝수합 시간복잡도 B(n) = 2n + 1");

		System.out.println("배열 짝수합 시간복잡도 A(n) = 3n + 1");

		System.out.println("n = 7 : W(n) = 29, B(n) = 15, A(n) = 22 ");
		
		System.out.println();

		int cntSum = 0;
		
		for (int i = 0; i < arrEvenSum.length; i++) {
			cntSum += evenSum(arrEvenSum[i], 7);
		}
		
		System.out.println("average case : " + (cntSum / 8.0));

	}

}
