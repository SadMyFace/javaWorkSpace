package day08;

public class Class01 {

	public static void main(String[] args) {
		/* 클래스 - 설계도
		 * 객체를 생성하기 위한 설계도
		 * 
		 * 클래스의 구성정보
		 * - 속성 : 멤버 변수
		 * - 기능 : 메서드
		 * 
		 * 프린터 클래스
		 * - 속성 : 크기, 제조사, 색, 구동방식, 제품명
		 * - 기능 : 인쇄, 스캔, 복사, 팩스
		 * 
		 * 멤버변수는 클래스 안, 메서드 밖(위)에 작성 => 4번 라인
		 * 멤버변수는 클래스 안에서 사용할 수 있다. =>
		 * (내 클래스의 모든 메서드에서 멤버 변수를 사용) => 공유
		 * 
		 * 접근제한자 class 클래스명 {
		 * 	// 클래스명은 반드시 대문자로 시작~!! (규칙)
		 * }
		 * 
		 * - 객체 선언
		 * 클래스명 객체명;
		 * 
		 * - 객체 선언 & 초기화(생성);
		 * 클래스명 객체명 = new 클래스명();
		 * 
		 * - 메서드 사용하는 방법
		 * 갹체명.메스드명();
		 * 
		 * - 같은 클래스 안에서 메서드를 호출할 때는 메서드명으로 호출 가능
		 * 	 => 메서드명();
		 * 
		 * -다른 클래스 안에서 메서드를 호출할 때는 객체를 이용하여 사용
		 *   => 객체명.메서드명();
		 * 
		 * 
		 * 
		 */
		
		/* 접근제한자 (제어자)
		 * - public : 모두 사용 가능.
		 * - protected : 나 + 패키지 + 자식클래스
		 * - (default) : 나 + 패키지
		 * - private : 나
		 * 
		 * 클래스에서 public을 붙일 수 있는건 파일명과 클래스명이 같을 때면 가능
		 * 멤버변수는 private, 메서드는 public
		 * 
		 * private : 멤버변수 / 메서드를 다른 클래스에서 접근할 수 없게 함
		 * - private으로 선언된 멤버변수를 접근할 때는 getter / setter라는 메서드를 통해
		 *   접근할 수 있다.
		 * 
		 * 
		 * 
		 * 
		 */
		
		Point p = new Point();
		p.print();
		
		p.x = 10;
		p.y = 5;
		p.print();
	}

}

/* 클래스 생성 위치
 * 다른 클래스 밖에서 생성
 * 
 */

// (0, 0)
class Point{
	//멤버변수 (캐 클래스의 모든 메서드에서 공유)
	//자동 초기화가 됨.
	int x;
	int y;
	
	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
}
