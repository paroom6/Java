package Exam;

import java.util.HashMap;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * map
		 * -key(키) value(값)으로 구분하여 데이터를 저장한느 방식
		 * -map의 구현 클래스로는 HashMap LinkedHashMap
		 * HashTable
		 * -HashMap은 데이터 순서가 보장되지 않는다.
		 * -HashMap의 순서를 보장하고 싶은 경우 LinkedHashMap을 사용한다
		 *   
		 */
		HashMap<String,String>dic = new HashMap<String, String>();
		dic.put("apple", "사과");//키값:apple value값:사과
		dic.put("banana", "바나나");
		dic.put("grape", "포도");
		//System.out.println(dic);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("찾을 단어 >> ");
			String find_word = sc.next();
			if(find_word.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			//입력받은 값을 Map에서 가져옴
			String word = dic.get(find_word);
			//입력받은 값이 Map에 저장된 키값과 비교해서 없다면 null을 반환
			if(word==null) {
				System.out.printf("%s는 없는 단어입니다.\n",find_word);
			}else {
				System.out.println(word);
			}
		}
	}

}
