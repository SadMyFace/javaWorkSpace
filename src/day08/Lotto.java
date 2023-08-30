package day08;

import java.util.Scanner;

public class Lotto {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 로또번호 생성 (1~45 랜덤으로 생성)
		 * 로또번호 => 1~45까지 6개 => 사용자번호
		 * 당첨번호 => 1~45까지 7개 => 보너스번호
		 * 
		 * 로또번호 (6자리) 1 2 3 4 5 6
		 * 당첨번호 (6자리 + 1자리) 1 2 3 4 5 6 [7]
		 * 로또번호는 중복되면 안됨
		 * 
		 * 로또 등수 확인
		 * 1등 => 6자리 일치
		 * 2등 => 5자리 일치 + 보너스 번호
		 * 3등 => 5자리 일치
		 * 4등 => 4자리 일치
		 * 5등 => 3자리 일치
		 * 나머지 => 꽝
		 * 
		 * 
		 */
		
		//info) 매개변수와 일반변수는 지역변수임
		
		Lotto l = new Lotto();
		
		int[] user = new int[6];
		int[] com = new int[7];
		
		user = l.userNum();
		com = l.comNum(1, 2);
		
		System.out.printf("사용자 번호: ");
		for(int i = 0; i < user.length; i++) {
			System.out.printf(user[i] + " ");
		}
		System.out.println();
		
		System.out.printf("당첨 번호: ");
		for(int j = 0; j < com.length; j++) {
			System.out.printf(com[j] + " ");
		}
		System.out.println();
		
		l.count(user, com);
		
		sc.close();
		
	}
	
	public int[] userNum() {
		int userNum[] = new int[6];

		while(true) {
			int count = 0;
			int check = 0;
			for(int i = 0; i < userNum.length; i++) {
				System.out.printf((i+1) + "번째 수 입력: ");
				userNum[i] = sc.nextInt();
				if(userNum[i] > 45 || userNum[i] < 0) {
					check++;
				}
			}
			for(int j = 0; j < userNum.length - 1; j++) {
				for(int k = j + 1; k < userNum.length; k++) {
					if(userNum[j] == userNum[k]) {
						count++;
					}
				}
			}
			if(check > 0) {
				System.out.println("1~45까지 입력");
				System.out.println("다시 입력");
				continue;
			}
			if(count == 0) {
				break;
			}else if(count > 0) {
				System.out.println("숫자 중복 입력!!");
				System.out.println("다시 입력해주세요");
			}
		}
		return userNum;
	}
	
	public int[] comNum(int num1, int num2) {
		int comNum[] = new int[num1];
		
		while(true) {
			int count = 0;
			
			for(int i = 0; i < comNum.length; i++) {
				comNum[i] = (int)(Math.random() * num1) + num2;
			}
			for(int j = 0; j < comNum.length - 1; j++) {
				for(int k = j + 1; k < comNum.length; k++) {
					if(comNum[j] == comNum[k]) {
						count++;
					}
				}
			}
			if(count == 0) {
				break;
			}
		}
		return comNum;
	}
	
	public void count(int[] user, int[] com) {
		int count = 0;
		int bonusCount = 0;
		
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < com.length; j++) {
				if((user[i] == com[j]) && (j == 6)) {
					bonusCount++;
				}else if(user[i] == com[j]) {
					count++;
				}
			}
		}
		
		if(count == 6) {
			System.out.println("1등");
		}else if(count == 5 && bonusCount == 1) {
			System.out.println("2등");
		}else if(count == 5) {
			System.out.println("3등");
		}else if(count == 4) {
			System.out.println("4등");
		}else if(count == 3) {
			System.out.println("5등");
		}else {
			System.out.println("꽝");
		}
		
	}	
		
}
