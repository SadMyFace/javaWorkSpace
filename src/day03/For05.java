package day03;

public class For05 {

	public static void main(String[] args) {
		/* 최소 공배수
		 * 공배수 : 공통된 배수
		 * 10: 10, 20, 30, 40, 50...
		 * 15: 15, 30, 45, 60, 75...
		 * 공배수: 30, 60, 90...
		 * 최소 공배수: 30
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		int value = 0;
		
		for(int i = 1; ;i++) {
			value = num1 * i;
			if(value % num1 == 0 && value % num2 == 0) {
				System.out.println(value);
				break;
			}
		}
	}

}
