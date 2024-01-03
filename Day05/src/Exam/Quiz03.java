package Exam;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 연산기호에 따라(덧셈+ 뺄셈- 곱셈* 나눗셈/)
		 * 사칙연산을 하는 프로그램을 작성
		 * 
		 * 숫자 3
		 * 기호+
		 * 숫자 3
		 * 결과6
		 * 기호 입력
		 * char 변수명 =sc.next().charAt(0);
		 * 
		 * %같은 다른 기호의 경우
		 * 기호를 잘못 입력하였습니다. 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("사칙연산 계산기");
		
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("기호 입력 : ");
		char calc = sc.next().charAt(0);
		System.out.print("숫자 입력 : ");
		int num2 = sc.nextInt();
		sc.close();
		
		switch(calc) {
			case'+':
				System.out.println("결과 : " + (num1+num2));
				break;
			case'-':
				System.out.println("결과 : " + (num1-num2));
				break;
			case'*':
				System.out.println("결과 : " + (num1*num2));
				break;
			case'/':
				System.out.println("결과 : " + (num1/num2));
				break;
			default:
				System.out.println("기호를 잘못 입력하였습니다.");
			
		}
		
		
		
	}

}
