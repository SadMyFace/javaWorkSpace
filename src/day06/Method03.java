package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용한 계산기 작성
		 * 연산자는 + - * / %만 허용
		 * 두 수의 연산자를 입력받아서 메서드를 활용하여 연산
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		String check = "";
		
		System.out.printf("intsert num1: ");
		num1 = sc.nextInt();
		System.out.printf("insert num2: ");
		num2 = sc.nextInt();
		System.out.printf("insert check: ");
		check = sc.next();
		
		Method03 m3 = new Method03();
		
		m3.result(num1, num2, check);
		
		sc.close();
		
	}
	
	
	public void result(int num1, int num2, String check) {
		switch(check) {
		case "+":
			System.out.println("result: " + (num1 + num2));
			break;
		case "-":
			System.out.println("result: " + (num1 - num2));
			break;
		case "*":
			System.out.println("result: " + (num1 * num2));
			break;
		case "/":
			System.out.println("result: " + ((double)num1 / num2));
			break;
		case "%":
			//rem2를 호출하여 몫과 나머지를 출력
			System.out.println("result: " + (num1 % num2));
			Method03 m3 = new Method03();
			double rem2[] = new double[2];
			rem2 = m3.rem(num1, num2);
			System.out.println("목"+rem2[0]);
			System.out.println("나머지"+rem2[1]);
			break;
		default:
			System.out.println("부호 입력 오류");
			break;
		}
	}
	
	/* 기능 : 두 정수를 입력받아 두 정수의 몫과 나머지를 double[]로 리턴
	 * 리턴타입 : double 타입의 배열
	 * 매개변수 : 두 정수
	 * 변수명 : rem2
	 */
	public double[] rem(double num1, double num2) {
		double rem2[] = new double[2];
		rem2[0] = (num1 / num2);
		rem2[1] = (num1 % num2);
		return rem2;
	}

}
