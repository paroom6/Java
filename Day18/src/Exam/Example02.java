package Exam;

import java.util.ArrayList;
import java.util.List;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list = new ArrayList<Integer>();
		for(int i =0; i<10; i++) {
			int temp = (int)(Math.random()*30);
			list.add(temp);
		}
		System.out.println("전체 데에이터 : "+list);
		for(int i = 0; i<list.size(); i++) {
			Integer value = list.get(i);//list에서 각 index에 위치한 값을 가져오기
			if(value % 2 == 0) {
				System.out.println(value);
			}
		}
	}

}
