package day03;

public class For01 {

	public static void main(String[] args) {
		
		/* 반복문: 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do ~ while문
		 * - for, while문은 동작 방식이 같음.
		 *   => 조건에 맞지 않으면 한번도 실행 안될 수 도 있음.
		 * - do ~ while문은 동작 방식이 조금 다름
		 *   => 조건에 맞지 않아도 무조건 한번은 실행
		 * 
		 * for(초기화; 조건식; 증감식){
		 * 	실행문;
		 * }
		 * 
		 * - 초기화 : 조건식이나 실행문에서 사용할 변수를 초기화
		 *   => 처음 1번만 실행
		 * 
		 * - 조건식 : 반복문의 반복을 결정하는 식(true => 반복) : 생략 가능
		 * - 증감식 : 조건식에서 사용되는 변수를 증가 / 감소시켜 반복횟수를 조절
		 */
		
		//1 ~ 10까지 출력하는 예제
		//초기화 : i변수 사용 => int i = 1;
		//조건식 : 10이 될때까지 => i <= 10;
		//증감식 : i가 1씩 증가 => i++; ( i = i + 1)
		//실행문 : i출력
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf(i + " ");
		}
		System.out.println(" ");
		System.out.println("-----------------------");
		
		for(int j = 10; j >= 1; j--) {
			System.out.printf(j + " ");
		}
		System.out.println(" ");
		System.out.println("-----------------------");	
		
		//2부터 10까지 짝수만 출력 예제
		for(int k = 2; k <=10; k += 2) {
			System.out.printf(k + " ");
		}
		
		
		//1부터 20까지 중 짝수만 출력 예제
		//if문을 사용하여 조건에 맞는 자료만 출력
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.printf(i + " ");
			}
		}
		System.out.println(" ");
		System.out.println("-----------------------");
		
		//1부터 10까지 홀수면 출력 /짝수 일때는 짝수 pass~!! 출력
		for(int num = 1; num <=10; num++) {
			if(num % 2 ==1) {
				System.out.println(num);
			}else {
				System.out.println("짝수 pass~!!");
			}
		}
		//1부터 10까지 합계 출력
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		System.out.println("sum: " + sum);
		
		//1부터 10까지 짝수의 합과 홀수의 합을 출력
		int firstNum = 0;
		int secondNum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				secondNum += i;
			}else {
				firstNum += i;
			}
		}
		System.out.println("홀수 합: " + firstNum);
		System.out.println("짝수 합: " + secondNum);
	}

}
