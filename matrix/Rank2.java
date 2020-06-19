package matrix;

import java.util.Random;
import java.util.Scanner;

//5명의 점수를 입력 받아서 1등 90,2등 86점,3등 77점,4등 66점,5등 40점으로 출력하시오. 행렬사용
public class Rank2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int[] scores = new int[5];
		int[] rank = new int[5];
		for(int i = 0; i < rank.length; i++) {
			rank[i] = 1 + i;
			scores[i] = rand.nextInt(101);
		}
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < rank.length; j++) {
				if(scores[i] > scores[j]) {
					int temp = scores[i];
					scores[j] = scores[i];
					scores[i] = temp;
				}
			}
		}
		for(int i = 0; i < rank.length; i++) {
			System.out.printf("%d 등: %d 점\n", rank[i],scores[i]);
		}
	}	
}
