package Exam;

import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("입력:");
		String s1 = sc.nextLine();
		if(s1.equals("apple")) {
			System.out.println("정답");
		}else if(!s1.equals("apple")) {
			System.out.println("오답");
		}
	}

}
