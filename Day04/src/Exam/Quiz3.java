package Exam;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자를 입력받아 그 수의 절대값을 구하는 코드를 작성
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		if(num>=0) {
			System.out.println(num);
		}else {
			System.out.println(-num);
		}

	}

}
