package Exam;

import java.util.Scanner;


public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch 문 
		 * 먼저 식을 계산하고 그결과값과 일치하는 case 문으로 분기함
		 * - case 문의 실행할 문장을 실행한 후 break를 만나면 switch문을 탈출
		 * 값에는 수식이 올수 없다.
		 * default는 생략가능, case문에 걸리지 않는 경우 default로 빠짐
		 * break문 
		 * 반복문인 for while ,do while 문을 실행을 중지시키거나 switch 문을 중지
		 * 특정 조건하에서 다음 실행문이 존재해도 강제탈출
		 * 
		 */
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
		
		
	}

}
