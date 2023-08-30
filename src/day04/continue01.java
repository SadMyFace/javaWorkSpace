package day04;

public class continue01 {

	public static void main(String[] args) {
		/* Continue: pass, skip 키워드
		 * 1~10까지 출력 5만 빼고
		 * 
		 * 
		 * 
		 * 
		 */
		
		for(int i = 1; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i + "");
		}
		
		/* 1~10까지중 홀수만 출력
		 * 짝수일때 continue를 써서 출력
		 * 
		 */
		
		System.out.println("===========================");
		
		for(int i =1; i <=10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		
		
	}

}
