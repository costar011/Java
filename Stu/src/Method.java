public class Method {

	public static void incAr(int a[]) {
		for(int i = 0; i < a.length; i++) {
			a[i] = a[i]+1;
		}

	}
	
	public static int getMax(int a[]) {
		int max = a[0];
		
		for(int i =0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int ar[] = {1,2,3,4};
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]+ " ");
		}
		
		System.out.println("\n 메소드 호출 후");
		incAr(ar);
		
		for(int i = 0; i< ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		System.out.println(getMax(ar));
	}

}

// 1. 배열 원소 중 가장 작은 수 구하는 메소드
// 2. 배열 원소 중 짝수의 개수 구하는 메소드
// 3. 배열의 원소 중 홀수의 개수 구하는 메소드 
