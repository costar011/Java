
public class Ex01 {

	public static void main(String[] args) {
		int score[] = new int[] {90,85,75,80,95};
		
		float sum=0, avg=0;
		
		for(int i = 0; i < score.length; i++) {
			sum =+ score[i];
		}
		
		avg = sum / (score.length);
		
		System.out.println("총점" + sum);
		System.out.println("평균" + avg);

	}

}
