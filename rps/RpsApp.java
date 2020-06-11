package rps;

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
			result = "DRAW";
		} else if()
		System.out.println("플레이어: "+ play);
		System.out.println("컴퓨터: " + com);
		System.out.println("플레이어: " + result);
	}

}
