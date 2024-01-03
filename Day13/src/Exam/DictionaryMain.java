package Exam;

import java.util.Scanner;

class Dictionary{
	private static String[]kor = {"사랑","아기","돈","미래","희망"};
	private static String[]eng = {"love","baby","money","future","hope"};

	public static String kor2Eng(String word) {
		// kor 배열 만큼 반복
		String answer="";
		for(int i = 0; i<kor.length; i++) {
			if(kor[i].equals(word)) {// kor 값과 같은 값이 있으면 값을 저장
				answer= kor[i]+"은 "+eng[i];
				break;
			}else {
				answer=word+"은 저의 사전에 없습니다.";
			}
		}
		return answer;
	}
}

public class DictionaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 해당 한글단어를 입력 받아 그 해당하는 단어의 영어 단어를 찾으세요
		 * 
		 *예시)
		 *한영 단어 검색 프로그램입니다
		 *한글단어?
		 *아기
		 *아기 baby
		 *한글단어?
		 *돈
		 *돈 money
		 *한글단어?
		 *한글
		 *한글은 저의 사전에 없습니다.
		 *그만
		 *프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("한영 단어 검색 프로그램입니다.");
			System.out.println("한글단어?");
			String word = sc.nextLine();
			if(word.equals("그만")) {
				//System.exit(0);
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println(Dictionary.kor2Eng(word));
			System.out.println();
		}
		sc.close();
		
		
	}

}
