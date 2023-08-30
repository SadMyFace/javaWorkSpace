package day02;

public class Switch {

	public static void main(String[] args) {
		/* switch문: 값에 따라 케이스를 알려주는 형식
		 * 
		 * switch(변수/식){
		 * case 값1 : 실행문1;
		 *	 break;
		 * case 값2 : 실행문2;
		 *	 break;
		 * case 값3 : 실행문3;
		 *	 break;
		 * default: 실행문4;
		 * 
		 * 
		 * break; => switch문을 빠져나갈때 사용
		 */
		
//		int num = 1;
//		switch(num) {
//		case 1:
//			System.out.println("num은 1입니다.");
//		case 2:
//			System.out.println("num은 2입니다.");
//			break;
//		case 3:
//			System.out.println("num은 3입니다.");
//			break;
//		default:
//			System.out.println("잘못된 입력입니다.");
		
		/* 1~6까지의 수를 랜덤으로 추출하여 주사위 : 0 출력
		 * 
		 */
		
		int num = (int)(Math.random() * 6) + 1;
		
		switch(num) {
		case 1:
			System.out.println(num);
			break;
		case 2:
			System.out.println(num);
			break;
		case 3:
			System.out.println(num);
			break;
		case 4:
			System.out.println(num);
			break;
		case 5:
			System.out.println(num);
			break;
		case 6:
			System.out.println(num);
			break;
		default:
			System.out.println("error");
			break;
		}
	}

}
