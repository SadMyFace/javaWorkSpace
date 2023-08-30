package day09;

import day08.Lotto;
import day08.과제;

public class BaseBallGame {

	public static void main(String[] args) {
		/* day08 과제 -> 메서드로 변경
		 * 랜덤번호 생성
		 * 배열에 추가(중복제거 메서드)
		 * 출력메서드
		 * 스트라이크 메서드 => 개수 리턴
		 * 볼 메서드 => 개수 리턴
		 * 
		 */
		Lotto l = new Lotto();
		과제 g = new 과제();
		
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		int sAndB[] = new int[2];
		
		comNum = l.comNum(3, 1);
		System.out.printf("comNUm: ");
		for(int i = 0; i < comNum.length; i++) {
			System.out.printf(comNum[i] + " ");
		}
		System.out.println();
		
		sAndB = g.gameStart(comNum);
	}
	
	/* 랜덤번호 생성 : 매개변수로 범위를 설정
	 * (int)(Math.random() * 9(개수)) + 1 (시작값);
	 * 매개변수 => 개수, 시작값
	 * if 처리 => 개수와 시작값이 바뀌어서 들어올 때 처리
	 * 
	 */
	
	
	
	
}
