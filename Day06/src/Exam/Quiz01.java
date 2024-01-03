package Exam;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 수를 입력 받아 그 수의 구구단을 출력
		 * 입력:5
		 * 출력
		 * 5*1=5
		 * 5*2=10
		 * .
		 * .
		 * .
		 * 5*9=45
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("구구단 숫자 입력");
		int num = sc.nextInt();
		int i = 0;
		while(true) {
			i++;
			System.out.println(num+" X "+i+" = "+(num*i));
			if(i==9) {
				break;
			}
		}
		/*
		 * int num = sc.nextInt();
		 * for(int i = 1; i<=9; i++){
		 * 		System.out.println(num+" X "+i+" = "+(num*i))
		 * }
		 */
		sc.close();
	}

}
