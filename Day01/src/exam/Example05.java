package exam;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 서식문자 
		 * %d : 정수(10진수) 
		 * %o : 정수(8진수) 
		 * %x : 정수(16진수)
		 * %f : 실수 
		 * %e : 지수(e표기 기반) 
		 * %g : 출력 대상에 따라 %e 또는 %f 형태로 출력 
		 * %s : 문자열
		 * %c : 문자 
		 * 
		 * 개행문자 
		 * \n : 줄바꿈 
		 * \t : 수평 탭 
		 */
		
		// 정수 출력 
		System.out.printf("%d\n", 10);
		System.out.printf("저는 대학교 %d 학년에 재학중입니다\n", 
				3);
		
		int age = 10;
		System.out.printf("저는 %d\t\t살 입니다", age);
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		System.out.println(a);
	}
}
