package Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner를 이용하여 한 라인을 읽고 공백으로 분리된 어절이 
		 * 몇 개 들어있는지 "그만" 을 입력할때 까지 반복하는프로그램
		 * 
		 * 입력 >> I love Java
		 * 어절개수 3
		 * 입력 >> 자바는 객체 지향 언어로써 매우 좋은 언어이다
		 * 어절개수 7
		 * 입력 >> 그만
		 * 종료합니다..
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("입력 >> ");
			String str = sc.nextLine();
			if(str.equals("그만")) {
				System.out.println("종료합니다..");
				break;
			}
			String[]word=str.split(" ");
			
			/*
			int count=1;
			for(int i = 0; i<str.length(); i++) {
				if(str.charAt(i)==' ') {
					count++;
				}
			}
			*/
			System.out.println("어절개수 "+word.length);
		}
	}

}
