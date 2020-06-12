package rps;

import java.util.Scanner;

public class WhileDemoPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1.게임 0.종료");
			switch(scan.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("게임 중");break;
			}
		}
	}
}
