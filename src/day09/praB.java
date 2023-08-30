package day09;

import java.util.Scanner;

public class praB {

	public static void main(String[] args) {
		
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		int count = 9;
		int start = 1;
		int s = 0, b = 0;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		randomArray(comNum, count, start);
		System.out.println("야구게임 시작");
		System.out.println("컴퓨터가 수를 결정했습니다.");
		
		while(s != 3) {
			//사용자 번호 받기
			System.out.println("1 ~ 9까지 3개의 숫자");
			
			for(int i = 0; i < myNum.length; i ++) {
				myNum[i] = sc.nextInt();
			}
			cnt++;
			
			s = strike(comNum, myNum);
			b = ball(comNum, myNum);
			
			if(s != 0) {
				System.out.printf(s + "s ");
			}
			if(b != 0) {
				System.out.printf(b + "b");
			}
			System.out.println();
			System.out.println("게임 횟수: " + cnt);
			if(s == 0 & b == 0) {
				System.out.println("out");
			}
			if(s == 3) {
				System.out.println("정답");
				break;
			}
		}
		
	}
	
	
	public static int random(int count, int start) {
		if(count < start) {
			int tmp = count;
			count = start;
			start = tmp;
		}
		return (int)(Math.random() * count) + 1;
	}
	
	public static boolean isContain(int arr[], int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	//배열 생성 메서드
	//리턴 boolean : 배열이 잘 생성되면 true, 아니면 false 리턴
	//매개변수 : 배열, count, start
	
	public static boolean randomArray(int arr[], int count, int start) {
		if(arr == null) {
			return false;
		}
		if(count < arr.length) {
			return false;
		}
		int i = 0;
		while(i < arr.length) {
			int r = random(count, start);
			if(!isContain(arr, r)) {
				arr[i] = r;
				i++;
			}
		}
		return true;
	}
	
	//배열 출력 메서드
	public static void printArray(int arr[]) {
		for(int tmp : arr) {
			System.out.println(tmp + " ");
		}
		System.out.println();
	}
	
	//스트라이크 메서드
	//기능 : com[], my[] 위치와 값이 모두 일치하면 count 리턴
	public static int strike(int com[], int my[]) {
		int cnt = 0;
		for(int i = 0; i< com.length; i++) {
			if(com[i] == my[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	//볼 메서드
	//기능 : com[], my[] 위치 상관없이 일치하면 카운트 증가 리턴
	public static int ball(int com[], int my[]) {
		int cnt = 0;
		for(int i = 0; i < com.length; i++) {
			if(isContain(my, com[i])) {
				cnt++;
			}
		}
		return cnt - strike(com, my);
	}
	
}
