package alone;

import java.util.Random;
import java.util.Scanner;

class Lotto{
	public void generate(Random random, int[] lotto) {
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
	}
}
public class LottoApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] lotto = new int[6];
		Lotto instance = new Lotto();
		while(true) {
			System.out.println("0.종료  1.로또구입");
			switch(scanner.nextInt()) {
			case 0:System.out.println("종료"); return;
			case 1:System.out.println("로또구입"); buyLotto(scanner, random, lotto, instance); break;
			default : System.out.println("잘못된 메뉴번호"); break;
			}
		}
	}

	public static void buyLotto(Scanner scanner, Random random, int[] lotto, Lotto instance) {
		System.out.println("구매금액 입력하세요");
		int money = scanner.nextInt();
		int num = money / 1000;
		if(num < 1) {
			System.out.println("천원부터 구매가능합니다.");
		} else {
			if(num > 5) {
				System.out.println("최대 구매 금액 5천원입니다.");
			} else {
				System.out.printf("로또 %d장 구매합니다\n",num);
				for(int i = 0; i < num; i++) {
					instance.generate(random, lotto);
					for(int j = 0; j < lotto.length; j++) {
						System.out.printf("%d\t",lotto[j]);
					}System.out.println();
				}
			}
		}
	}
}



