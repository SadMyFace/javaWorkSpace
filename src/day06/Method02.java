package day06;

import java.util.Scanner;

public class Method02 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - * / %
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		 * + 일 때 호출 => 메인에서 출력
		 * - 일 때 호출 => 메인에서 출력
		 * * 일 때 호출 =>메서드에서 출력
		 * / 일 때 호출 =>메서드에서 출력 => 리턴을 double로
		 * % 일 때 호출 =>메서드에서 출력
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		String str = "";
		System.out.printf("insert num1: ");
		num1 = sc.nextInt();
		System.out.printf("insert num2: ");
		num2 = sc.nextInt();
		System.out.printf("insert check: ");
		str = sc.next();
		
		switch(str) {
		case "+":
			System.out.println(add(num1, num2));
			break;
		case "-":
			System.out.println(sub(num1, num2));
			break;
		case "*":
			mul(num1, num2);
			break;
		case "/":
			div(num1, num2);
			break;
		case "%":
			rem(num1, num2);
			break;
		default:
			System.out.println("부호 입력 오류");
			break;
		}
		
		int method01 = Method01.sum(10, 30); // Method01 클래스에서 정의한 sum 메서드
		System.out.println(method01);
		
		//다른 클래스에 있는 메서드를 사용 (static 있는 경우)
		//클래스명.메서드명
		//클래스 => 정의서 => 객체를 생성해서 메서드를 사용
		//현재 시점에서 객체 생성없이 메서드를 사용할 수 있는 이유 = static
		//(static이 없는 경우) - 선언만 해놓고 생성이 안되어있다는 것을 의미
		// 객체를 생성 => 클래스가 필요
		
		Method02 ts = new Method02();
		int s = ts.test(15, 35);
		System.out.println(s);
		
		sc.close();
		
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	public static void div(int num1, int num2) {
		System.out.println((double)num1 / num2);
	}
	public static void rem(int num1, int num2) {
		System.out.println(num1 % num2);
	}
	
	
	public int test(int num1, int num2) {
		return num1 + num2;
	}

}
