package Exam;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 수를 입력받아 3의배수이면 3의 배수입나다 
		 * 아니면 3의배수가 아닙니다를 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		if(num%3==0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}

}
class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 수를 입력받아 3의배수이면 3의 배수입나다 
		 * 아니면 3의배수가 아닙니다를 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		if(num%3==0) {
			System.out.printf("입력하신 숫자 %d는 3의 배수입니다.\n",num);
		}else {
			System.out.printf("입력하신 숫자 %d는 3의 배수가 아닙니다.",num);
		}

	}

}
