package day08;

import java.util.Scanner;

public class Method08 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/* 배열이 주어졌을 때 배열을 출력하는 메서드 생성
		 * 
		 */
		
		Method08 m = new Method08();
		
		int arr[] = new int[] {1, 2, 9, 13, 7, 5, 6, 10, 4, 8, 3, 11, 12, 14, 15};
		
		int num;
		
		arr = m.line(arr);
		
		m.printArray(arr);
		
		System.out.println("------------------------------");
		System.out.printf("insert num: ");
		arr = m.randomArray(num = sc.nextInt());

		arr = m.line(arr);
		
		m.printArray(arr);
		
	}
	
	/* 배열을 받아서 콘솔에 출력하는 메서드
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메서드명 : printArray()
	 * 옆으로 출력 / 5개씩 한줄로 나열
	 */
	
	public void printArray(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
			count++;
			if(count % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	/* 주어진 정수 배열을 정렬하는 기능
	 * 
	 */
	public int[] line(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위 (1~100까지)
	 * 매개변수 : 배열 개수
	 * 리턴타입 : 배열
	 * 메서드명 : randomArray()
	 * 
	 * 
	 */
	
	public int[] randomArray(int num) {
		int arr[] = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		return arr;
	}
	
}
