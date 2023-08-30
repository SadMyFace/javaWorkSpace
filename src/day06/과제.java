package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보 게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택
		 * ( 0 = 가위, 1 = 바위, 2 = 보)
		 * 사용자도 가위, 바위, 보 중 선택해서 입력(숫자, 문자 상관 없음)
		 * 결과 =>
		 * 컴퓨터 > 가위, 사용자 > 가위  => 결과 : 무승부입니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		과제 rps = new 과제();
		
		int comRps = (int)(Math.random() * 3);
		
		System.out.print("가위(0), 바위(1), 보(2) 중 입력: ");
		int userRps = sc.nextInt();
		
		System.out.printf("user > ");
		rps.opRps(userRps);
		
		System.out.printf("computer > ");
		rps.opRps(comRps);
		
		System.out.printf("결과: ");
		
		rps.compareRps(userRps, comRps);
		
		sc.close();
		
	}

	public void compareRps(int num1, int num2) {
		if(num1 == 0) {
			if(num2 == 0) {
				System.out.println("무승부");
			}else if(num2 == 1){
				System.out.println("패배");
			}else if(num2 == 2) {
				System.out.println("승리");
			}else {
				System.out.println("컴퓨터 입력 오류");
			}
		}else if(num1 == 1) {
			if(num2 == 0) {
				System.out.println("승리");
			}else if(num2 == 1){
				System.out.println("무승부");
			}else if(num2 == 2) {
				System.out.println("패배");
			}else {
				System.out.println("컴퓨터 입력 오류");
			}			
		}else if(num1 == 2) {
			if(num2 == 0) {
				System.out.println("패배");
			}else if(num2 == 1){
				System.out.println("승리");
			}else if(num2 == 2) {
				System.out.println("무승부");
			}else {
				System.out.println("컴퓨터 입력 오류");
			}
		}else {
			System.out.println("입력 오류(가위, 바위, 보 중 입력)");
		}
	}
	
	public void opRps(int num) {
		if(num == 0) {
			System.out.println("가위");
		}else if(num == 1) {
			System.out.println("바위");
		}else if(num == 2) {
			System.out.println("보");
		}else {
			System.out.println();
		}
	}
	
}

