package day05;

public class Array03 {

	public static void main(String[] args) {
		/* 1~10까지 담고 있는 배열 arr를 생성 후 출력
		 * 
		 */
		
		int arr[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------------");
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int temp : arr) {
			System.out.println(temp);
		}
	}

}
