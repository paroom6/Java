package Exam;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 수를 입력받아 짝수인지 홀수인지 판단
		 * 삼항연산자로
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("홀짝 판별기");
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		String result = (num%2==1)? "홀수":"짝수";
		System.out.println(result);
		sc.close();
	}

}
