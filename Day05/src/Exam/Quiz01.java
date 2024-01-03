package Exam;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 아이디와 비밀번호를 입력받아
		 * 아이디가 admin 비밀번호가 1234로 입력받으면
		 * 로그인 성공
		 * 아이디가 다르면 "아이디를 잘못입력하셨습니다"
		 * 비밀번호가 다르면 "비밀번호를 잘못입력하셨습니다"
		 * 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pw = sc.next();
		
		if(id.equals("admin")&&pw.equals("1234")) {
				System.out.println();
				System.out.println("로그인 성공");
			}else if(!id.equals("admin")) {
				System.out.println();
				System.out.println("아이디를 잘못입력하셨습니다");
			}else {
				System.out.println();
				System.out.println("비밀번호를 잘못입력하셨습니다");
		}
		sc.close();

	}

}
class Quizre {

	public static void main(String[] args) {
		/*
		 * 아이디와 비밀번호를 입력받아
		 * 아이디가 admin 비밀번호가 1234로 입력받으면
		 * 로그인 성공
		 * 아이디가 다르면 "아이디를 잘못입력하셨습니다"
		 * 비밀번호가 다르면 "비밀번호를 잘못입력하셨습니다"
		 * 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("사용할 아이디 입력 : ");
		String id = sc.next();
		System.out.print("사용할 비밀번호 입력 : ");
		String pw = sc.next();
		
		System.out.println();
		System.out.println("로그인");
		System.out.println();
		
		System.out.print("아이디 입력 : ");
		String id1 = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pw1 = sc.next();
		if(id1.equals(id)) {
			if(pw1.equals(pw)) {
				System.out.println();
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호를 잘못 입력하셨습니다");
			}
		}else {
			System.out.println("아이디를 잘못 입력하셨습니다");
		}
		sc.close();
		
	}

}
