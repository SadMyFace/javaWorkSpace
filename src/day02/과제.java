package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 카페에 제출
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 + = * / %
		 * ex)
		 * 3 2 + => 3+2 = 5
		 * 6 3 / => 6/3 = 2
		 * 만약 연산자의 종류가 다른 연산자가 들어오면 잘못된 입력~!!
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫번째 숫자(정수) 입력: ");
		int num1 = sc.nextInt();
		System.out.printf("두번째 숫자(정수) 입력: ");
		int num2 = sc.nextInt();
		System.out.printf("연산자 입력: ");
		String check = sc.next();

		
		switch(check){
		case "+" :
			System.out.println("result:"+num1+check+num2+"="+(num1 + num2) );
			break;
		case "-" :
			System.out.println("result:"+num1+check+num2+"="+(num1 - num2) );
			break;
		case "*" :
			System.out.println("result:"+num1+check+num2+"="+(num1 * num2) );
			break;
		case "/" :
			System.out.println("result:"+num1+check+num2+"="+(num1 / (double)num2) );
			break;
		case "%" :
			System.out.println("result:"+num1+check+num2+"="+(num1 % num2) );
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
		
		sc.close();
		
		
	}

}
