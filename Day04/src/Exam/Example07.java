package Exam;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * x&&y : x,y 모두 참이여야 참
		 * x||y : x,y 둘 중 하나가 참일 때 참
		 *  !x  : x가 거짓이면 참
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 지갑속 금액: ");
		int money = sc.nextInt();
		boolean card = true;
		if(money >=3800 || card) {
			System.out.println("택시를 타고 귀가했습니다");
		}else {
			System.out.println("걸어서 귀가했습니다");
		sc.close();
		}
	}
}
