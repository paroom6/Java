package Exam;

import java.util.ArrayList;
import java.util.List;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("딸기");
		list.add("망고");
		System.out.println(list);
		list.add("체리");
		list.add("파인애플");
		System.out.println(list);
		list.add(2,"수박");
		System.out.println(list);
		
		// 값 변경
		list.set(4, "파인애플"); // 4번째 인덱스에 체리를 파인애플로 변경
		System.out.println(list);
		
		//값 삭제
		/*
		 * ArrayList의 데이터 삭제는 단지 데이터만 삭제되는게 아닌
		 * 값이 있던 공간까지 삭제됨, 배열의 경우 공간을 삭제할 수 없지만
		 * 뒤에 데이터들이 앞으로 이동한다.
		 */
		list.remove(1);
		System.out.println(list);
		list.remove("파인애플");//중복시 앞의 데이터 삭제
		System.out.println(list);
		
		// 리스트 값 전체 삭제
		list.clear();
		System.out.println(list);
		
	}

}
