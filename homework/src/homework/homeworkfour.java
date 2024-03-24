package homework;

import java.util.Scanner;

public class homeworkfour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		int[] arr2 = new int[7];
		int max = 0;
		int max2 = 0;
		int min = 10000;
		int min2 = 10000;

		System.out.print("5개 쓰시오 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if ( max < arr[i]) {
	            max = arr[i];
			}
			
			if ( min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print("7개 쓰시오 : ");

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		
			if ( max2 < arr2[i]) {
	            max2 = arr2[i];
			}
			
			if ( min2 > arr2[i]) {
				min2 = arr2[i];
			}
		}
		
		if (max == max2) {
			System.out.println(min);
		}
		else {
			System.out.println("없음");
		}
		if (min == min2) {
			System.out.println(max);
		}
		else {
			System.out.println("없음");
		}
         
      }

	}


