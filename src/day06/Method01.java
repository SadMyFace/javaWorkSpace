package day06;

public class Method01 {

	//메서드 선언 위치
	
	public static void main(String[] args) {
		/* 메서드 : 기능 / 함수
		 * 접근제어자(제한자) : 접근할 수 있는 주체의 제한 범위
		 * 리턴타입 : 메서드에 실행 결과로 받을 수 있는 정보의 값(자료형)
		 * 메서드명 : 메서드의 이름 => 소문자로 시작
		 * 매개변수 : 메서드를 실행하기 위해서 필요로 하는 값(자료형 변수명)
		 * 메서드 선언구현
		 * 접근제어자 리턴타입 메서드명(매개변수, 매개변수) {
		 *   구현;
		 *  }
		 * 메서드 선언 위치
		 * 클래스 안, 다른 메서드 밖
		 * 
		 * 
		 * 
		 */
		
		int sum = sum(3, 5);
		System.out.println(sum);
		
		int sum1 = sum(sum, 10);
		System.out.println(sum1);
		
		int sum2 = multi(3, 5);
		System.out.println(sum2);
		
		say(4, 6); 
		
	}
	
	//메서드 선언 위치
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 알려줘야 하는 값 => 합(int)
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 메서드명 : sum
	 * 
	 * 
	 */
	
	public static int sum(int num1, int num2) {
		int result = num1 + num2; 
		
		return result;
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타입:
	 * 매개변수:
	 * 메서드명:
	 * 
	 */
	
	public static int multi(int num1, int num2) {
		int result = num1 * num2;
		
		return result;
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 
	 */
	public static void say(int num1, int num2) {
		int say = num1 + num2;
		System.out.println(say);
	}
	
}
