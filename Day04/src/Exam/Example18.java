package Exam;

import java.util.Scanner;

public class Example18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String s = sc.nextLine();
		System.out.print("입력: ");
		String str = sc.nextLine();
		
		if(s.equals(str)) {
			System.out.println("같음");
		}else if(!s.equals(str)) {
			System.out.println("같지않음");
		}
		sc.close();
	}

}
