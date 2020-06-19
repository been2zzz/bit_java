package sequence;

import java.util.Scanner;

public class InputSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한계값 입력");
		int lim = scanner.nextInt();
		int sum = 0;
		int i = 0;
		for(i = 0; i < lim; i++) {
			if((i+1) % 2 == 0) {
				sum += (i+1);
			}
		}
		System.out.println(sum);
	}
}
