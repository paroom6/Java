package exam;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10~99사이의 숫자를 입력받아 십의자리와 일의 자리를 구하세요
		 * ex 79
		 * 십의자리:7
		 * 일의자리:9
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("10~99 사이의 숫자를 입력해주세요.");
		int num = sc.nextInt();
		int x = num/10;
		int y = num%10;
		System.out.println("십의 자리: "+x);
		System.out.println("일의 자리: "+y);
		System.out.println("입력받은 숫자 " + num +"의 십의 자리 숫자는 "+ x+", 일의 자리 숫자는 " +y +"입니다."); 
	}

}
