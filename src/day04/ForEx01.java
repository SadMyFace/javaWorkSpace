package day04;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/*
		 * 소수 : 약수가 1과 나 자신의 수만 가지는 수를 소수
		 * 소수 : 2, 3, 5, 7, 9, 11, 13, 17...
		 */
		
		/*
		 * num을 입력받아서 num가 소수인지 아닌지 판별
		 * ex) num = 3 => 소수입니다.
		 *     num = 12 => 소수가 아닙니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		int num;
//		int check = 0;
//		
//		System.out.printf("insert number: ");
//		num = sc.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			if(num % i == 0) {
//				check++;
//				if(i == num && check == 2) {
//					System.out.println("소수입니다.");
//				}else if(i == num && check != 2) {
//					System.out.println("소수가 아닙니다.");
//				}
//		}
//			
//		sc.close();
		
		/* 
		 * 2 ~ 100까지 중 소수를 출력
		 */
		

		
		for(int i = 2; i <= 100; i++) {
			int check = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					check++;
					if(i == j && check == 2) {
						System.out.println(i);
					}
				}
			}
		}
		System.out.println();
		System.out.println("================");
		System.out.println();
		/* 별찍기
		 * 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		 */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <=5; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 */

		System.out.println();
		System.out.println("================");
		System.out.println();		
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 
		 * 
		 */
		System.out.println();
		System.out.println("================1");
		System.out.println();		
				
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.printf(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("================");
		System.out.println();			

		}
		
		
	}

