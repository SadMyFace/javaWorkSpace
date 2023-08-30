package day05;

public class Array05 {

	public static void main(String[] args) {
		/*	arraycopy: 배열 복사
		 * 객체를 다시 생성해서 값을 복사
		 * 배열은 길이를 가지고 있음
		 * 한번 정해진 길이는 늘이거나 줄일 수 없음
		 * 이후 추가/삭제 불가능
		 * 배열의 길이를 늘이거나 줄이고 싶을 경우 배력 복사를 통해
		 * 길이를 조절
		 * 
		 */
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		
		for(int temp : arr) {
			System.out.print(temp+" ");
		}
		
		System.out.println();
		System.out.println("---------------");
		
		//arraycopy 이용
		int arr1[] = new int[5];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr1[i] = arr[i];
//		}
		
		for(int temp : arr1) {
			System.out.print(temp+" ");
		}
		
		/* 3개의 값을 담을 수 있는 String 배열 생성 후
		 * 국어, 영어, 수학 글자를 담은 후 출력(향상된 for문)
		 * 
		 * 5개의 값을 담을 수 있는 String 배열 생성 후
		 * 사회, 과학을 추가하여 향상된 for문으로 출력
		 */
		System.out.println("--------------------");
		
		String str1[] = new String[] {"국어", "영어", "수학"};
		String str2[] = new String[] {"", "", "", "사회", "과학"};
		
		for(String temp : str1) {
			System.out.print(temp+" ");
		}

		System.out.println("--------------------");
		
		System.arraycopy(str1, 0, str2, 0, str1.length);
		for(String temp : str2) {
			System.out.print(temp+" ");
		}
		
		
	}

}
