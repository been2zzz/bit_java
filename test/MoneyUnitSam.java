package test;

import java.util.Scanner;

class Money0{
	public String calc(int price) {
		int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] counts = new int[8];
		String result = "";
		
		for(int i = 0; i < units.length; i++) {
			counts[i] = price/units[i];
			price %= units[i];
		}
		return String.format("5만원 : %d개\n 1만원 : %d개\n 5천원 : %d개\n 천원 : %d개\n 오백원 : %d개\n 백원 : %d개\n 오십원 : %d개\n 십원 : %d개\n",
				counts[0],counts[1],counts[2],counts[3],counts[4],counts[5],counts[6],counts[7]);
	}
}

public class MoneyUnitSam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.입력");
			switch(scanner.nextInt()) {
			case 0:return;
			case 1:
				System.out.println("금액 입력: ");
				int price = scanner.nextInt();
				System.out.printf("요청금액 : %d원\n",price);
				Money0 money = new Money0();
				System.out.println(money.calc(price));
			}
		}
	}
}
