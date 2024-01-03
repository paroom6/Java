package Exam;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 중첩 if문 
		 * if문 안에 또다른 if문 삽입
		 * if(조건){
		 * if(조건){
		 * 실행문}
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score>=90) {
			if(score>=95) {
				System.out.println("A+학점");
			}else {
				System.out.println("A학점");
			}
		}else if(score>=80) {
			if(score>=85) {
				System.out.println("B+학점");
			}else { 
				System.out.println("B학점");
			}
		}else if(score>=70) {
			if(score>=75) {
				System.out.println("C+학점");
			}else {
				System.out.println("C학점");
			}
		}else if(score>=60) {
			if(score>=65) {
				System.out.println("D+학점");
			}else {
				System.out.println("D학점");
			}
		}else {
			System.out.println("F학점");
		}
		sc.close();

	}

}
          