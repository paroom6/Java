package Exam;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("숫자입력 >> ");
			int num1 = sc.nextInt();
			System.out.println("숫자입력 >> ");
			int num2 = sc.nextInt();
			System.out.println(num1/num2);
		}catch(Exception e){
			System.out.println("잘못 입력하셨습니다.");
			//e.printStackTrace();
		}
	}
}
