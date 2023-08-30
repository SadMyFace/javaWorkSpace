package day03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		/* num = 6의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 */

		int testNum = 12;
		for(int i = 1; i <= testNum; i++) {
			if(testNum % i == 0 ) {
				System.out.printf(i + " ");
			}
		}
		
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("insert number: ");
		int num = sc.nextInt();
		
		System.out.printf("약수: ");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0 ) {
				System.out.printf(i + " ");
			}
		}
		
		System.out.println();
		
		sc.close();
		
	}

}
