package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/* 5자리의 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력
		 * ex) 11456 => 65411 => 6 + 5 + 4 + 1 + 1
		 * ex) 19547 => 74591 => 7 + 4 + 5 + 9 + 1
		 * 
		 * Integer.parseInt(); // String값을 Int로
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("insert number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int arrnum[] = new int[] {0, 0, 0, 0, 0};
		
		arrnum[4] = num % 10; 
		arrnum[3] = (num % 10000) / 1000;
		arrnum[2] = (num % 1000) / 100;
		arrnum[1] = (num % 100) / 10;
		arrnum[0] = (num % 10);
		
		for(int i = 0; i < arrnum.length; i++) {
			System.out.printf(arrnum[i]+"");
			sum += arrnum[i];
		}
		
		System.out.println();
		System.out.println(sum);
		
		sc.close();
	}

}
