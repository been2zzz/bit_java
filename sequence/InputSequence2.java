package sequence;

import java.util.Scanner;

public class InputSequence2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		int min = 100, max = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.println("점수: ");
			arr[i] = scan.nextInt();
			sum += arr[i];
			if(min > arr[i]) min = arr[i];
			if(max < arr[i]) max = arr[i];
		}
		sum -= max + min;
		System.out.println("평균: " + sum / 3);
		
	}

}
