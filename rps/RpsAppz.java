package rps;

import java.util.Random;
import java.util.Scanner;

/*
결과값
"플레이어: 가위"
"컴퓨터: 보"

"승리"
"무승부"
"패배"
 */

public class RpsAppz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		while(true) {
			System.out.println("메뉴: 0.종료 1.게임");
			switch (scanner.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: game(scanner, random); break;
			}
		}
	}
	private static void game(Scanner scanner, Random random) {
		System.out.println("가위, 바위, 보를 고르세요");
		System.out.println("1.가위 2.바위 3.보");
		int play = scanner.nextInt();
		int com = random.nextInt(3) + 1;
		String result = "";
		if(play == com) {
			result = "무승부";
		} else if(play == 1 && com == 2 || play == 2 && com == 3 || play == 3 && com == 1) {
			result = "패배";
		} else {
			result ="승리";
		}
		String rpsP = rps(play);
		String rpsC = rps(com);
		
		System.out.println("플레이어: " + rpsP);
		System.out.println("컴퓨터: " + rpsC);
		System.out.println("플레이어 " + result);
	}
	private static String rps(int i) {
		String z = "";
		switch(i) {
		case 1 :z = "가위"; break;
		case 2 :z= "바위" ;break;
		case 3 :z= "보" ;break;
		} return z;
	}

}
