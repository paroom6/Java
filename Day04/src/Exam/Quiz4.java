package Exam;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 중간고사 시험
		 * 성적이 70이상이면 합격 미만이면 불합격
		 * 0~100의 범위를 초과시 입력범위를 초과하였습니다 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력: ");
		int score = sc.nextInt();
		
		if(score>100) {
			System.out.println("입력범위를 초과하였습니다.");
		}else if(score>=70) {
			System.out.println("합격");
		}else if(score>=0) {
			System.out.println("불합격");
		}else {
			System.out.println("입력범위를 초과하였습니다.");
		}
		sc.close();
		
	}

}
