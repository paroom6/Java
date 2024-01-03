package Exam;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~입력받은 수까지의 합계를 계산
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		for(int i=1;i <= num; i++) {
			sum= sum+i;
		}
		System.out.println(sum);
		sc.close();
	}
	

}
                                         