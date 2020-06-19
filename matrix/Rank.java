package matrix;

import java.util.Scanner;

//5명의 점수를 입력 받아서 1등 90,2등 86점,3등 77점,4등 66점,5등 40점으로 출력하시오. 행렬사용
public class Rank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] arr = new int[5];
		int[] score = new int[5];
		int[][] res = {arr,score};
		for(int i = 0; i <score.length; i++) {
			arr[i] = 1 + i;
			System.out.println("점수입력: ");
			score[i] = scan.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(score[i] > score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for(int i=0; i < arr.length; i++) {
			System.out.printf("%d 등: %d 점\n",arr[i],score[i]);
		}
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[i].length; j++) {
				System.out.printf("%s\t",res[i][j]);	
			}System.out.println();
		}
	}	
}
