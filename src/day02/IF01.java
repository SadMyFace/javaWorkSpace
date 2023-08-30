package day02;

public class IF01 {

	public static void main(String[] args) {
		int num = 10;
		
		if(num >0) {
			System.out.println("양수");
		}
		
		if(num >0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		if(num >0) {
			System.out.println("양수");
		}else if(num == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		//num가 0보다 크면 양수(10보다 크면 10보다 큽니다. / 아니면 음수 / 0이면 0
		num = 15;
		if(num > 0) {
			System.out.println("양수");
			if(num > 10) {
				System.out.println("10보다 큽니다.");
			}
		}else if(num == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		//num2 값을 지정하고, num2가 짝수인지 홀수인지 콘솔에 찍기
		
		int num2 = 4;
		if(num2 % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		int kor = 80;
		int eng = 30;
		int math = 100;
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		
		System.out.println("합계: "+sum+"   평균: "+avg);
		if(avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
	}

}
