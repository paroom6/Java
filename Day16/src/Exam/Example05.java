package Exam;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * finally
		 * 예외 발생 여부와 관계없이 무조건 실행되는 구문
		 * 예외처리를 할 때 예외와 상관없이 반드시 처리해야 하는 구문들을 작성할 때 사용됨
		 * 생략가능하다.
		 * 
		 * try{
		 * 
		 * }catch(){
		 * 
		 * }finally{
		 * 
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("점수를 입력하세요 >> ");
			int score = sc.nextInt();
			if(score >= 65) {
				System.out.println("합격입니다.");
			}else{
				System.out.println("불합격입니다.");
			}
		} catch (Exception e) {
			System.out.println("잘못입력하셨습니다.");
			// TODO: handle exception
		}finally {
			System.out.println("프로그램 종료");
		}
		
		
		
	}

}
