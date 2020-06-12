package rps;

import java.util.Random;
import java.util.Scanner;

public class Vanila {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		while(true) {
			System.out.println("0.종료 1.게임");
			switch(scan.nextInt()) {
			case 0 : System.out.println("게임종료"); return;
			case 1 :game(scan, random); break; 
			}
		}
	}

	private static void game(Scanner scan, Random random) {
		System.out.println("가위 바위 보 고르세요");
		System.out.println("1.가위 2.바위 3.보");
		int player = scan.nextInt();
		int com = random.nextInt(3)+1;
		String result ="";
		
		if(player == com) {
			result = "무승부";
		} else if(player==1 && com==3 || player==2 && com==1 || player==3 && com ==2) {
			result = "승리";
		} else {
			result = "패배";
		}
		
		String strP = rps(player);
		String strC = rps(com);
		
	
		System.out.println("플레이어: " + strP);
		System.out.println("컴퓨터: " + strC);
		System.out.println("플레이어 " + result);
	}

	private static String rps(int player) {
		String str = "";
		switch(player) {
		case 1: str = "가위"; break;
		case 2: str = "바위"; break;
		case 3: str = "보"; break;
		}
		return str;
	}

}
