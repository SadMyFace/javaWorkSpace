	package day06;

import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1 ~ 6까지 랜덤수
		 * ex)
		 * 주사위 : 3
		 * 3칸 이동 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 이동 => ??칸 남았습니다.
		 * ...
		 * 도착했습니다
		 * 굴린 주사위 : ??번
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = 30;
		int count = 0;
		String enter = " ";
		
		for(;;) {
			int roll = (int)(Math.random() * 6) + 1;
			System.out.printf("roll dice(Press Enter)");
			enter = sc.nextLine();
			if(enter.equals("")) {
				System.out.println("주사위: " + roll);
				count++;
				num -= roll;
				if(num < 0) {
					num = 0;
				}
				System.out.printf("%d칸 이동 => %d칸 남았습니다\n", roll, num);
				System.out.println();
				if(num == 0) {
					System.out.println("도착했습니다.");
					System.out.printf("굴린 주사위: %d번\n", count);
					break;
				}
			}else {
				System.out.println("Enter 입력!!");
				System.out.println();
			}
		}
		
		sc.close(); 
		
	}

}
