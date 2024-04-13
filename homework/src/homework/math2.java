package homework;

public class math2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumOdd(arr));
    }

    static int sumOdd(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}

/* 
 * 합계를 저장할 변수 sum을 0으로 초기화
 * 
 * 배열 arr을 순회하는 반복문을 시작
 * 
 * 배열의 각 요소를 i라고 할 때, i가 홀수인지 확인
 * 
 * 만약 i가 홀수라면, sum에 i를 더함 
 * 
 * 모든 요소를 순회한 후, sum을 반환
 * */