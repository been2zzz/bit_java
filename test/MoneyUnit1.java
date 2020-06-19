package test;

import java.util.Scanner;

class Money1{
	public static void go(Scanner scan, int[] unit) {
		System.out.println("금액 입력:");
		int input = scan.nextInt();
		System.out.printf("요청금액 : %d 원\n",input);
		for(int i = 0; i < unit.length; i++) {
			System.out.printf("%d원 : %d개\n", unit[i],input / unit[i]);
			input %= unit[i];
		}
	}
}
public class MoneyUnit1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		System.out.println("0.종료 1.실행");
		while(true) {
			switch(scan.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 : Money1.go(scan, unit); break;
			}
		}
	}
}
