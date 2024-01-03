package Exam;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 합격 불합격  판별
		 * 입력 받은 숫자가 70이상이면 합격
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적입력: ");
		int num = sc.nextInt();
		String result = (num>=70)?"합격":"불합격";
		System.out.println(result);
		if(num>=70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}

}
