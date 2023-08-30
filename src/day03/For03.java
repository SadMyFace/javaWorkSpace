package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/* 단을 입력받아서 입력받은 단을 출력
		 * ex) 2 =>
		 * 2*1=2
		 * 2+2=4
		 * 2*3=6
		 * ...
		 * 2*9=18
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("insert number: ");
		int num = sc.nextInt();
		
		
		for(int i = 1; i <= 9; i++) {
			sum = num * i;
			System.out.println(num+"*"+i+"="+sum);
		}
		
		sc.close();
	}

}
