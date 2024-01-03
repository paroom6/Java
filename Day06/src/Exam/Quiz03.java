package Exam;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *
		 * 숫자를 계속 입력받아 입력받은 수의 총합
		 * 0입력시 "프로그램 종료"라는 메시지를 띄우고 중단
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.print("합산할 숫자를 입력: ");
			int num = sc.nextInt();
			sum += num;
			if(num==0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println();
		System.out.println("입력받은 수의 총합 : "+sum);
		sc.close();
	}


}
