package homework;

public class math3 {
    public static void main(String[] args) {
    	
    	//배열에서 짝수만 덧셈하기 의사코드 작성하고 구현 및 시간복잡도 구하기
    	
        int[] arr = {4, 3, 1, 5, 2}; // 예시 배열
        int sum = 0; // 짝수의 합을 저장할 변수
        
        for (int i : arr) {
            if (i % 2 == 0) { // 현재 요소가 짝수인지 확인
                sum += i; // 짝수일 경우, sum에 더하기
            }
        }
        
        System.out.println(sum); // 짝수의 합 출력, 출력값: 6 (4 + 2)
    }
}
