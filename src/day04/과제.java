package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 5명의 정수를 입력받아서 배열에 저장하고,
		 * 정수의 합계와 평균을 출력
		 * 최고점수
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int sum = 0;
		int highScore = 0;
		int lowScore = 100;
		double avg;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("insert score: ");
			score[i] = sc.nextInt();
			sum += score[i];
			if(score[i] > highScore) {
				highScore = score[i];
			}
			if(score[i] < lowScore) {
				lowScore = score[i];
			}
			System.out.println();
		}

		avg = (double)sum / score.length; 
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
		System.out.println("highscore: "+highScore);
		System.out.println("lowscore: "+lowScore);
		sc.close();
		
	}

}
