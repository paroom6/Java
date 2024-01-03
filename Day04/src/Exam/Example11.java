package Exam;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요");
		int num = sc.nextInt();
		if(num==1) {
			System.out.println("커피");
		}else if(num==2) {
			System.out.println("콜라");
		}else if(num==3) {
			System.out.println("사이다");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
