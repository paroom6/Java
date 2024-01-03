package Exam;

import java.util.Scanner;

public class Exampe16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ==: 객체가 같은지를 비교하지만 객체가 가지고 있는 문자열을 비교하지않는다
		 * equals(): 문자가 가지고 있는 데이터값 그자체를 비교한다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String s = sc.nextLine();
		if(s=="apple") {
			System.out.println("같음");
		}else if(s!="apple") {
			System.out.println("같지않음");
		}
		
	}

}
