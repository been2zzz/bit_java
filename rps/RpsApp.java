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

public class RpsApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위, 바위, 보를 고르세요");
		System.out.println("1.가위 2.바위 3.보");
		int play = scan.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		String result = "";
		if(play == com) {
			result = "무승부";
		} else if(play == 1 && com == 2 || play == 2 && com == 3 || play == 3 && com == 1) {
			result = "패배";
		} else {
			result ="승리";
		}
		String pText = "";
		String cText = "";
		if(play == 1) {;
			pText = "가위";
		} else if (play == 2) {
			pText = "바위";
		} else {
			pText = "보";
		}
		if(com == 1) {
			cText = "가위";
		} else if (com == 2) {
			cText = "바위";
		} else {
			cText = "보";
		}
		System.out.println("플레이어: " + pText);
		System.out.println("컴퓨터: " + cText);
		System.out.println("플레이어 " + result);
	}
}
