package day07;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
		 * ex) 3, * => ***
		 * 5, o => ooooo
		 * 7, * => *******
		 * 
		 * matin에서 숫자와 기호를 입력받아 메서드호출 => 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Method07 m = new Method07();
		
		System.out.printf("숫자 입력:");
		int num = sc.nextInt();
		System.out.printf("기호 입력: ");
		char c = sc.next().charAt(0);
		
		m.prints(num, c);
		
		sc.close();
		
	}
	
	public void prints(int num, char c) {
		System.out.printf(num + ", " + c + " => ");
		for(int i = 0; i < num; i++) {
			System.out.printf(c + "");
		}
	}
	
	
	
}
