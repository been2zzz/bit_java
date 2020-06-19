package sequence;

import java.util.Scanner;

public class Sam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("점수: ");
			arr[i] = scanner.nextInt();
		}
		int max = 0, min = 100;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i=0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("평균: " + sum/5);
		
	}
}
