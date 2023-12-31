package Exam;

import java.util.HashMap;
import java.util.Hashtable;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashMap 단일 스레드 환경에서 사용하기 좋은 구조, key value 값이 null을 허용
		 * Hashtable 멀티 스레드환경에서 사용하기 좋은 구조, key value 값이 null 비허용
		 * 
		 */
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("apple", "사과");
		map1.put("banana", "바나나");
		map1.put("grape", "포도");
		map1.put(null, "오렌지");
		map1.put("coffee", null);
		System.out.println(map1);
		
		Hashtable<String, String> map2 = new Hashtable<String, String>();
		map2.put("apple", "사과");
		map2.put("banana", "바나나");
		map2.put("grape", "포도");
		//map2.put(null, "오렌지");
		//map2.put("coffee", null);
		System.out.println(map2);
	}

}
