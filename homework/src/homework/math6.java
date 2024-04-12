package homework;

public class math6 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9};
        System.out.println(Max(arr));
    }

    static int Max(int[] arr) {
        int max = arr[0];
        int max2 = Integer.MIN_VALUE; 
        
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max2 = max;
                max = arr[i];
            } else if (max2 < arr[i] && arr[i] < max) {
                max2 = arr[i];
            }
        }
        System.out.println(max); 
        
        return max2; 
    }
}

/* 
 * 최대값 max를 배열의 첫 번째 요소로 초기화
 * 
 * 두 번째 최대값 max2를 0 또는 배열의 최소값으로 초기화
 *  배열 arr을 순회하는 반복문을 시작
 *  - 현재 요소가 max보다 크다면, max2를 max로 갱신하고, max를 현재 요소로 갱신
 *  - 현재 요소가 max2보다 크고 max보다 작다면, max2를 현재 요소로 갱신
 * 
 * 모든 요소를 순회한 후, max2로 반환
 * */