package day07;

import java.util.Scanner;

public class 과제 {
	
	//공통 변수들 선언 == 멤버 변수
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		/* 계산기 만들기
		 * ( + - * / %) 각각 메서드 만들기 => 메서드에서 바로 출력
		 * ex) 3 5 => 메뉴
		 * 원하는 계산을 선택해주세요 >
		 * 1. 덧셈
		 * 2. 뺄셈
		 * 3. 곱셈
		 * 4. 나눗셈
		 * 5. 나머지
		 * 각 기능 메서드 => 바로 출력(3 * 5 = 8)
		 * 
		 * 
		 * 
		 * 1. 숫자 입력받는 메서드 => 숫자를 배열에 담아 리턴
		 * 2. 메뉴 메서드 => 메뉴를 출력하고, 메뉴의 번호를 입력받아 리턴
		 * 3. 각 기능 메서드들
		 * 
		 * main에서 할 일
		 * 1) 1번 메서드 호출 => 숫자의 배열을 받기
		 * 2) 2번 메서드 호출 => 내 선택 번호 가져오기
		 * 3) switch(번호)
		 * 4) 기능 메서드 호출
		 * 
		 * 
		 */
		
		과제 m = new 과제();
		
		int[] num = new int[2];
		num = m.insertNum();
		
		int selectMenu = m.menu();
		
		switch(selectMenu) {
		case 1:
			m.add(num);
			break;
		case 2:
			m.sub(num);
			break;
		case 3:
			m.mul(num);
			break;
		case 4:
			m.div(num);
			break;
		case 5:
			m.rem(num);
			break;
		default:
			System.out.println("입력 오류( 1 ~ 5 입력)");
			break;
		}
		
		sc.close();
		
	}
	
	public int[] insertNum() {
		int[] num = new int[2];
		
		System.out.printf("insert first num: ");
		num[0] = sc.nextInt();
		
		System.out.printf("insert second num: ");
		num[1] = sc.nextInt();
		
		return num;
		
	}
	public int menu() {
		
		System.out.println("원하는 메뉴를 입력하세요 > ");
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.println("4. 나눗셈");
		System.out.println("5. 나머지");
		
		int menu = sc.nextInt();

		return menu;
	}
	
	public void add(int[] num) {
		int add = num[0] + num[1];
		System.out.println("result: " + num[0] + "+" + num[1] + "=" + add);
	}
	public void sub(int[] num) {
		int sub = num[0] - num[1];
		System.out.println("result: " + num[0] + "-" + num[1] + "=" + sub);
	}
	public void mul(int[] num) {
		int mul = num[0] * num[1];
		System.out.println("result: " + num[0] + "*" + num[1] + "=" + mul);
	}
	public void div(int[] num) {
		double div = (double)num[0] / num[1];
		System.out.println("result: " + num[0] + "/" + num[1] + "=" + div);
	}
	public void rem(int[] num) {
		int rem = num[0] % num[1];
		System.out.println("result: " + num[0] + "%" + num[1] + "=" + rem);
	}
	

}
