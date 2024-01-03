package Exam;

import java.util.Scanner;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		if(age>19) {
			System.out.println("성인입니다.");
		}else if(age>13) {
			System.out.println("청소년입니다.");
		}else if(age>6) {
			System.out.println("초등학생입니다.");
		}else {
			System.out.println("유아입니다.");
		}

	}

}
