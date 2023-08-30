
public class 배열01 {

	public static void main(String[] args) {
		/* 배열 : 같은 타입, 같은 의미를 가지는 변수의 집합 (참조변수)
		 * 
		 * - 참조변수는 초기화가 미리 되어 있음 // Null or 0
		 * - 기본형 변수는 초기화를 해주지 않음 // 직접 초기화를 해주어야 함
		 * - 배열 선언 방법
		 * 타입[] 배열이름;
		 * 타입 배열이름[];
		 * 
		 * - 배열 선언 & 초기화;
		 * 타입[] 배열이름 = new 타입[길이]; // 가장 일반적인 방법
		 * 타입[] 배열이름 = new 타입[]{값, 값, 값, 값, 값, ...};
		 * 타입[] 배열이름 = new {값, 값, 값, ...}; // 선언과 동시에 초기화를 할 때만 가능
		 * 
		 * - 배열의 길이는 0 이상이어야 한다.
		 * - 배열의 길이는 length 확인할 수 있음
		 * - 배열의 시작번지는 0번지부터 시작함
		 * 배열[3] => 0 1 2
		 * 배열의 마지막 번지는 항상 length - 1
		 * 
		 * 
		 */
		
		int[] arr;
		arr = new int[5]; // 0 0 0 0 0
		
		int arr1[]; //Null
		int arr2[] = new int[] {1, 2, 3, 4, 5};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf(arr2[i] + " ");
		}
		
		
//		System.out.println(arr2);
//		System.out.println(arr);
		
		int arr3[] = {1, 2, 3};
		
		/* 배열을 사용하는 이유
		 * - 반복문을 이용할 수 있기 때문에 편리함
		 * - 관리가 쉽다.
		 * 
		 * 
		 * 
		 * 
		 */
		
		//배열에 값을 추가
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr[0]);

		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i * 10) + 10;
		}

		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/* 배열을 생성하고, 1 2 3 4 5로 저장하고, 출력
		 * 
		 */
		
		int arr4[] = new int[] {1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		int arr5[] = new int[] {2, 4, 6, 8, 10};
		
		for(int i = 0; i < arr5.length; i++) {
			if(arr5[i] % 2 == 0) {
				System.out.println(arr5[i]);
			}
		}
		
		
	}

}
