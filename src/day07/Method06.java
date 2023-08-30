package day07;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 단 1개를 주고, 구구단을 출력
		 */
		
		//2 ~ 9까지 반복하여 모든 단을 출력
		
		Scanner sc = new Scanner(System.in);
		
		Method06 m = new Method06();
		
		System.out.println("insert number:");
		int num = sc.nextInt();
		m.nine(num);
		
		for(int inNum = 2; inNum <= 9; inNum++) {
			m.nine(inNum);
		}
		
		sc.close();
		
	}
	
	// 기능 : 단이 주어지면 그 단의 구구단을 출력
	public void nine(int num) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}
		System.out.println("-------------------");
	}
}
