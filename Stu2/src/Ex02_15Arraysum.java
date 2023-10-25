public class Ex02_15Arraysum {
public static void main(String[] args) {

int[] score=new int[] {90,85,75,80,95};
float sum=0, avg=0;
for(int i=0;i<score.length;i++)
{ sum+=score[i];
       }
 avg=sum/(score.length);
System.out.println("score 총점은 "+ sum);
System.out.println("score 평균은 "+ avg);
}
}