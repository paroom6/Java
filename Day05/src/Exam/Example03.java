package Exam;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 점수 입력 이후 학점분류
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력 : ");
		int score = sc.nextInt();
		char grade;
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
		sc.close();
	}

}

