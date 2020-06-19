package test;

import java.util.Scanner;

/* 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램
* [요구사항] 금융업을 하는 고객사로부터 프로그램 개발요청이 들어왔습니다.
* 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램입니다.
* 예를들어, 125,520 원을 입력하면 화면에 이렇게 보이게 하면 됩니다.
* 표시하고 10원미만은 절삭
 ******************************************************
   요청금액 : 126520 원
   5만원 : 2매
   1만원 : 2매 
   5천원 : 1매 
   1천원 : 1매 
   5백원 : 1개
   백원 : 0개
   오십원 : 0개
   십원 : 2개
 *******************************************************
 */
class Money{
	public static void extracted(Scanner scan, int[] unit, int[] num) {
		System.out.println("금액 입력: ");
		int input = scan.nextInt();
		System.out.printf("요청금액 : %d 원\n",input);
		for(int i = 0 ; i < unit.length; i++) {
			num[i] = input / unit[i];
			input -= (num[i] * unit[i]);
			System.out.printf("%d원 : %d개\n",unit[i],num[i]);
		}
	}
}

public class MoneyUnit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] num = new int[8];
		Money money = new Money();
		int won = 0;
		while(true) {
			System.out.println("0.종료 1.금액입력");
			switch(scan.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: money.extracted(scan, unit, num); break;
			}
		}
	}
}
