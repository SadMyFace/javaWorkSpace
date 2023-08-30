package day02;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		/* 수를 입력받아서 2의 배수가 맞으면 2의 배수입니다.
		 * 3의 배수가 맞으면 3의 배수입니다.
		 * import 단축키 ctrl + shift + o
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insert number: ");
		int num = sc.nextInt();
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3의 배수");
		}else if(num % 2 == 0 && num != 0) {
			System.out.println("2의 배수");
		}else if(num % 3 == 0 && num !=0) {
			System.out.println("3의 배수");
		}
		
	}

}
