package day09;

import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {
		/* 두 정수의 사칙연산(+ - * / %)을 처리
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		MethodEx02 m = new MethodEx02();
		
		while(true) {
			int num1, num2;
			System.out.println("1.+ 2.- 3.* 4./ 5.% 0.end");
			
			System.out.println("choice menu");
			int menu = sc.nextInt();
			
			
			switch(menu) {
			case 1:
				System.out.println("insert num: ");
				num1 = sc.nextInt();
				System.out.println("insert num: ");
				num2 = sc.nextInt();
				System.out.println(m.add(num1, num2));
				break;
			case 2:
				System.out.println("insert num: ");
				num1 = sc.nextInt();
				System.out.println("insert num: ");
				num2 = sc.nextInt();
				System.out.println(m.sub(num1, num2));
				break;
			case 3:
				System.out.println("insert num: ");
				num1 = sc.nextInt();
				System.out.println("insert num: ");
				num2 = sc.nextInt();
				System.out.println(m.mul(num1, num2));
				break;
			case 4:
				System.out.println("insert num: ");
				num1 = sc.nextInt();
				System.out.println("insert num: ");
				num2 = sc.nextInt();
				System.out.println(m.div(num1, num2));
				break;
			case 5:
				System.out.println("insert num: ");
				num1 = sc.nextInt();
				System.out.println("insert num: ");
				num2 = sc.nextInt();
				System.out.println(m.rem(num1, num2));
				break;
			case 0:
				break;
			default:
				System.out.println("error");
				break;
			}
			
			if(menu == 0) {
				break;
			}
		}
	}
	
	//사칙 연산의 메서드를 생성 static 없이 생성
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int sub(int num1, int num2) {
		return num1 - num2;
	}	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	public double div(int num1, int num2) {
		return (double)num1 / num2;
	}
	public int rem(int num1, int num2) {
		return num1 % num2;
	}

}
