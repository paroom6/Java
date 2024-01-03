package Exam;

import java.util.Scanner;


public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money=0;
		while(true) {
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔금|4.종료");
			System.out.println("----------------------");
			System.out.print(">>");
			int choice = sc.nextInt();
			if(choice==1) {
				System.out.print("예금액: ");
				money = sc.nextInt();
			}else if(choice==2) {
				System.out.print("출금액: ");
				int num = sc.nextInt();
				if(num>money) {
					System.out.println("잔액이 부족합니다.");
				}else {
					money = money-num;
				}
			}else if(choice == 3) {
				System.out.println("잔고: "+ money);
			}else if(choice == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}

}
