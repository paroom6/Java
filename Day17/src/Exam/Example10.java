package Exam;

import java.util.ArrayList;
import java.util.List;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		System.out.println(list);
		list.add("포도");
		list.add("체리");
		System.out.println(list);
		//데이터 삽입을 원하는 위치에 기존데이터가 존재하면 기존데이터는 뒤로 이동하고 새로운데이터가 그 자리에 추가됨
		list.add(2,"망고");
		list.add(3,"수박");
		System.out.println(list);
		
	}

}
