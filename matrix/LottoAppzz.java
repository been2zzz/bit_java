package matrix;

import java.util.Random;
import java.util.Scanner;

class Lotto{
	private int limit;
	public void setLimit(int limit) {this.limit = limit;}
	public int getLimte() {return limit;}
	public int buy(int money) {
		int count = 0;
		if(money < 1000) {
			System.out.println("천원부터 구매가능");
		} else {
			if(limit > money / 1000) {
				count = money / 1000;
			} else {
				count = limit;
			}
		}
		return count;
	}

}
public class LottoAppzz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("구매 제한량 설정");
		Lotto lot = new Lotto();
		lot.setLimit(scan.nextInt());
		
		while(true) {
			System.out.println("0.종료 1.로또구입");
			switch(scan.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: buy(scan, lot);break;
			default:
				break;
			}
		}
	}

	public static void buy(Scanner scan, Lotto lot) {
		System.out.println("로또구입"); 
		System.out.println("구매금액 입력: ");
		System.out.printf("구입로또 %d장",lot.buy(scan.nextInt()));
	}

}





