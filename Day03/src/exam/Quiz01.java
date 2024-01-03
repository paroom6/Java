package exam;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * 자신의 나이(int) 이름(string) 학교 거주지를 입력받아 출력하는 프로그램 제작
		 * 출력결과
		 * 저의 나이는 이고, 이름은 , 학교는 이며 에 살고 있습니다
		 * 
		 *  콘솔창에 한 줄로 출력
		 *  next-한단어밖에 인식못함
		 *  nextLine-
		 * */
		System.out.println("정보를 입력해주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("학교: ");
		String school = sc.next();
		String dummy = sc.nextLine();
		System.out.print("주거지: ");
		String home = sc.nextLine();
		System.out.println();
       
		System.out.println("저의 나이는 "+ age+"이고, "+ "이름은 "+name+ ", 학교는 "+school+ "이며 "+home+ "에 살고 있습니다.");

		// 풀이
		System.out.println("정보를 입력해주세요.");
		System.out.print("나이: ");
		int age1 = sc.nextInt();
		sc.nextLine();

		System.out.print("이름: ");
		String name1 = sc.nextLine();
		sc.nextLine();

		System.out.print("학교: ");
		String school1 = sc.nextLine();

		
		System.out.print("주거지: ");
		String home1 = sc.nextLine();
       
		System.out.printf("저의 나이는 %d이고, 이름은 %s, 학교는 %s이며 %s에 살고 있습니다.",age1,name1,school1,home1);
	}

}
