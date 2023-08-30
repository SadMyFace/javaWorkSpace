package day08;

import java.util.Scanner;

public class 과제 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤으로 생성 (1~9까지만) = > 중복 X
		 * user가 3자리 숫자를 맞추는 게임
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 없으면 out
		 *
		 * ex) 3 5 7
		 *     3 6 7 => 2s
		 *
		 * 	   3 5 7
		 *     3 7 6 => 1s 1b
		 *    
		 *     3 5 7
		 *     7 3 5 => 3b
		 *    
		 *     3 5 7
		 *     1 2 6 => out
		 *
		 *
		 * -야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자 입력(1~9, 3자리):
		 * 3 4 5
		 * 결과
		 * 3s 다 맞으면 종료 (게임 횟수 출력)
		 */
		과제 m = new 과제();
		
		int comNum[] = new int[3];
		comNum = m.makeRandom();
		m.gameStart(comNum);
		
		sc.close();
		
	}

	public int[] makeRandom() {
		int comRan[] = new int[3];
		
		while(true) {
			int count = 0;
			
			for(int i = 0; i < comRan.length; i++) {
				comRan[i] = (int)(Math.random() * 9) + 1;
			}
			
			for(int j = 0; j < comRan.length; j++) {
				for(int k = j + 1; k < comRan.length; k++) {
					if(comRan[j] == comRan[k]) {
						count++;
					}
				}
			}
			if(count == 0) {
				System.out.println("야구게임 시작");
				System.out.println("컴퓨터가 숫자를 정했습니다.");
				break;
			}
		}
		return comRan;
	}
	
	public int[] gameStart(int[] comNum) {
		int userNum[] = new int[3];
		int sAndB[] = new int[2];
		
		int checkCount = 0;
		while(true) {
			int strike = 0;
			int ball = 0;
			
			System.out.println("숫자 입력(1~9)");
			
			
			for(int i = 0; i < userNum.length; i++) {
				userNum[i] = sc.nextInt();
			}
			checkCount++;
			
			for(int j = 0; j < userNum.length; j++) {
				for(int k = 0; k < userNum.length; k++) {
					if(comNum[j] == userNum[k]) {
						if(j == k) {
							strike++;
						}else {
							ball++;
						}
					}
				}
			}
			
			sAndB[0] = strike;
			sAndB[1] = ball;
			
			if(strike == 3) {
				System.out.println("3s 게임회수: " + checkCount);
				break;
			}
			
			if(strike == 0 && ball == 0) {
				System.out.println("out!!");
			}else {
				System.out.println("s: " + s(sAndB));
				System.out.println("b: " + b(sAndB));
			}
		}
		return sAndB;
	}
	
	public int s(int[] num1) {
		return num1[0];
	}
	
	public int b(int[] num2) {
		return num2[1];
	}

}
