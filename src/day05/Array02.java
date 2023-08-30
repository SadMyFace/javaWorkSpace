package day05;

public class Array02 {

	public static void main(String[] args) {
		/* Array 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50 사이의 랜덤값을 저장한 후 출력
		 * 
		 */
		
		int arr[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = (int)(Math.random() * 50) + 1;
			System.out.println(arr[i]);
		}
		System.out.println("==================");
		
		
		//정렬(오름차수)
		
		//4 37 23 9 43
		//4 37 23 9 43 pass1
		//4 23 37 9 43 pass2
		//4 9 23 37 43 pass3
		//4 9 23 37 43 pass4
		
		//4 23 9 37 43 pass1
		//4 9 23 37 43 pass2
		
		//이중 for문 필요
		
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) { //내림차순
					//교환
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//향상된 for문
		System.out.println();
		System.out.println("향상된 for >");
		for(int temp : arr) {
			System.out.println(temp);
		}
		
		
	}

}
