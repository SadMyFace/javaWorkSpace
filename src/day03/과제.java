package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up / down 게임
		 * 1 ~ 50 사이의 랜덤수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤 수 생성
		 * 입력 > 10
		 * up~!!
		 * 입력 >20
		 * up~!!
		 * 입력 > 40
		 * down~!!
		 * 입력 > 35
		 * 정답~!!
		 */
		Scanner insert = new Scanner(System.in);
		
		int insertNumber;
		
		int randomNumber = (int)(Math.random() * 50) + 1;
		
		System.out.println("1 ~ 50까지의 수 입력");
		for(;;) {
			System.out.printf("insert number: ");
			insertNumber = insert.nextInt();
			if(insertNumber == randomNumber) {
				System.out.println("정답~!!");
				break;
			}else if(insertNumber > randomNumber) {
				System.out.println("down~!!");
			}else {
				System.out.println("up~!!");
			}
		}
		
		insert.close();
		
	}

}
