package day07;

import java.util.Scanner;

public class Method05 {

	public static void main(String[] args) {
		/* 2 ~ 100까지의 소수를 출력
		 * 2 ~ 100까지 for문을 돌려서 메서드 호출하여 true라면 출력
		 */
		
		// 2~100까지의 소수의 합계
		
		// 값을 입력받아서 소수인지 아닌지 출력
		
		Scanner sc = new Scanner(System.in);
		
		Method05 m = new Method05();
		
		int sum = 0;
		
		for(int i = 2; i <= 100; i++) {
			if(m.checkNum(i) == true) {
				sum += i;
				System.out.printf(i + " ");
			}
		}
		System.out.println();
		System.out.println("sum: " + sum);
		
		System.out.println("insert number: ");
		int num = sc.nextInt();
		
		if(m.checkNum(num) == true) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
	}
	
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단(소수면 true / 소수가 아니면 false)
	 * 소수 : 1과 자기 자신만을 약수로 가지는 수
	 * 리턴타입 :
	 * 매개변수 :
	 * 메서드명 :
	 */
	
	public boolean checkNum(int num) {
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			} 
		}
		if(count == 2) {
			return true;
		}
		return false;
	}

}
