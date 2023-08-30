package day07;

public class Method04 {

	public static void main(String[] args) {
		/* 메서드 : 기능을 하기 위한 코드 조각
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수) {
		 *  코드;
		 *  return;
		 *  .... (실행X)
		 * }
		 * 
		 * return : 메서드에서 전달해야하는 값을 전달하는 역할
		 * 메서드에서 return을 만나면 리턴 타입의 값을 전달하고, 메서드를 종료
		 * 
		 */
		
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * 3. 배열의 정수 5개와 평균을 출력하는 메서드 (출력)
		 * 4. 메인에서는 연산하여 있으면 안됨
		 * 5. 메서드간의 데이터 전달 및 호출만 있어야 함.
		 * 카페에 제출
		 */
		
		Method04 r = new Method04();
		
		int num[] = new int[5];
		double avg = 0.0;
		
		num = r.ranNum();
		avg = r.avgNum(num);
		r.printAvg(num, avg);
		
		System.out.println("----------------");
		r.avgNum();
		
		
	}
	
	public int[] ranNum() {
		int[] num = new int[5];
		for(int i = 0; i < 5; i++) {
			num[i] = (int)(Math.random() *100) + 1;
		}
		return num;
	}
	
	public double avgNum(int[] num) {
		
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < 5; i++) {
			sum += num[i];
		}
		avg =  sum / 5.0;
		return avg;
	}
	
	public void printAvg(int[] num1, double num2) {
		for(int i = 0 ; i < 5; i++) {
			System.out.println(num1[i]);
		}
		System.out.println("평균: " + num2);
		return;
	}
	
	/* 배열을 전달받아서 평균을 연산하는 메서드(리턴x)
	 * 매개변수 : x
	 * 리턴타입 : x
	 * 메서드명 : average
	 * 
	 */
	
	//메서드 오버로딩 : 같은 메서드명을 쓰더라도, 배개변수의 종류나, 개수가 다르면 사용가능함
	
	public void avgNum() {
		int arr[] = ranNum(); //
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;
		
		printAvg(arr, avg);
	}

}
