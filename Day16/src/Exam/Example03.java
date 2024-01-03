package Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >> ");
		try {
		int score = sc.nextInt();
		if(score >= 65) {
			System.out.println("합격입니다.");
		}else{
			System.out.println("불합격입니다.");
		}
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("잘못입력하셨습니다.");
		}
	}

}
