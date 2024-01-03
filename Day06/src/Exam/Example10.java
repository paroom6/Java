package Exam;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0이입력되면 종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자 입력:0이 입력되면 종료");
			int num = sc.nextInt();
			if(num==0) {
				System.out.println("프로그램 종료");
				break;
				
			}
		}
		sc.close();
	}

}
