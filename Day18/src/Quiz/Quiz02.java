package Quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자 6개를 입력받아 이를 오름차순으로 정렬하는 프로그램 작성
		 * 단 숫자는 중복되지않음
		 * 입력 >> 5 5 2 3 4 1
		 * 출력 >> 1 2 3 4 5
		 */
		Scanner sc = new Scanner(System.in);
		HashSet<Integer>list = new HashSet<Integer>();//중복불가 순서 없음(오름차순 정렬)
		System.out.print("입력 >> ");
		for(int i=0; i<6; i++) {
			int num= sc.nextInt();
			list.add(num);
		}
		System.out.print("출력 >> ");
		Iterator iter = list.iterator();// 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자 (Iterator)사용
		while(iter.hasNext()) { //hasNext() : 가져올 객체가 있다면 true 리턴, 없다면 false 리턴
		    System.out.print(iter.next()+" ");// next() : Iterator에서 하나의 객체를 가져올 수 있는 메소드
		}
		//System.out.println(list); 대괄호와 ,이 같이 출력
		
	}

}
