package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수를 입력받아서
		 * 합계, 평균, 평가를 출력
		 * 평가는 평균이 90 이상이면 A
		 * 평균이 80 이상이면 B
		 * 70 이상이면 C
		 * 나머지는 D
		 * 입력 받는 값이 0보다 작거나 100보다 크면 잘못된 값이라고 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어 점수 입력: ");
		int kor = sc.nextInt();
		if(kor < 0 || kor > 100) {
			System.out.println("잘못된 값");
			return;
		}
		System.out.printf("영어 점수 입력: ");
		int eng = sc.nextInt();
		if(eng < 0 || eng > 100) {
			System.out.println("잘못된 값");
			return;
		}
		System.out.printf("수학 점수 입력: ");
		int math = sc.nextInt();
		if(math < 0 || math > 100) {
			System.out.println("잘못된 값");
			return;
		}
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		if(avg >= 90) {
			System.out.println("grade: A");
		}else if(avg >= 80) {
			System.out.println("grade: B");
		}else if(avg >= 70) {
			System.out.println("grade: C");
		}else {
			System.out.println("grade: D");
		}
		
		sc.close();
				
	}

}
