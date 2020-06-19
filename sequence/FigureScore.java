package sequence;

import java.util.Scanner;

//7명의 심사위원의 점수중에서 0-100 만점에서 최고점과 최하점을 제외한 5명 점수평균구하기

public class FigureScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째 점수입력");
			score[i] = scanner.nextInt();
			sum += score[i];
		}
		 int min = score[0]; 
         for (int i = 0; i < score.length; i++) {
             if( min > score[i]) {
                 min = score[i];
             }
         }
		 int max = score[0]; 
         for (int i = 0; i < score.length; i++) {
             if( max < score[i]) {
                 max = score[i];
             }
         }
         sum -= max + min;
         System.out.println(sum / 3);
	}
}
