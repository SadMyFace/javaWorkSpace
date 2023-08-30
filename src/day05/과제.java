package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 파일명 5개가 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가
		 * 있는 파일들을 출력하도록 코드를 작성하시오
		 * 
		 * 제출
		 */
		
		// contains(str) : str의 단어가 포함되어 있는지 체크 return true / false
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg",
				"String메서드.txt","String함수.jpg","java의 함수.png"};
		
		System.out.printf("insert filename: ");
		String checkFile = sc.next();
		
		System.out.println("--검색 결과--");
		for(int i = 0; i < fileName.length; i++) {
			if(fileName[i].contains(checkFile)) {
				System.out.println(fileName[i]);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("해당 단어가 포함된 파일이 없습니다.");
		}
		
		sc.close();
		
	}

}
