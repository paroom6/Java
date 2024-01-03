package Exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List
		 * 배열과 유사한 자료구조로 중복이 허용되면서
		 * 저장순서가 유지되는 구조
		 * 배열과의 차이점은 크기에 제한이 없고, 삽입,삭제 수정이 용이함
		 * List컬렉션은 List인터페이스를 생성하여 기능을 정의하고
		 * 하위클래스에 상속해 그 기능을 구현하도록 한다
		 * List<Obj> list = new ArrayList<Obj>();
		 * List<Obj> list = new ArrayList<>(); -별 차이없다
		 * Obj : 리스트에 저장할 데이터 유형 Wrapper 클래스 사용
		 * ArrayList : 클래스
		 */
		
		List<String> list1 = new ArrayList<String>();
		list1.add("사과");
		list1.add("딸기");
		list1.add("바나나");
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list2);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("사과");
		list3.add("딸기");
		list3.add("바나나");
		System.out.println(list3);
		
		/*
		 * List<>list = new ArrayList<>();
		 * ArrayList<>list = new ArrayList<>();
		 * List는 인터페이스이고 ArrayList는 이 List를 구현한 클래스
		 * 그러므로 List로 선언한 경우 인스턴스를 ArrayList로 받을 수
		 * 있고 LinkedList로도 받을 수 있다.
		 * 
		 * ArrayList로 선언한 경우 ArrayList의 인스턴스를 만드므로
		 * ArrayList만 받을 수 있다.
		 * 
		 */
		List<Integer> list = new ArrayList<Integer>();
		list = new LinkedList<Integer>();
		
		//ArrayList<Integer> arraylist = new ArrayList<Integer>();
		//arraylist = new LinkedList();
		

	}

}
