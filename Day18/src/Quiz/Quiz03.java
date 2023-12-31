package Quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 나라 이름과 인구수를 입력받아 Map에 저장하고
		 * 그만을 입력하면 입력을 멈추고 검색을 실행
		 * 나라이름을 검색하면 그 해당국가의 인구수를 출력하고
		 * 그만을 입력하면 프로그램 종료!!
		 */
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		while(true) {
			System.out.println("나라 이름, 인구 >> ");
			String word = sc.next();
			if(word.equals("그만")) {
				System.out.println("입력 종료");
				break;
			}
			int pop = sc.nextInt();
			list.put(word, pop);
		}
		while(true) {
			System.out.println("검색할 나라를 입력 >>");
			String word = sc.next();
			try {//int 타입은 null값을 받아들이지 못해 에러가 나기에 try catch 처리
				if(word.equals("그만")) {
					System.out.println("프로그램 종료!!");
					break;
				}
				int pop = list.get(word);
				System.out.printf("%s의 인구수는 %d명 입니다.\n",word,pop);
				} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("해당 국가의 데이터는 없습니다.");
			}
		}
	}

}
