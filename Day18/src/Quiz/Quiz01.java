package Quiz;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 랜덤함수를 이용해 10개의 수(1~30)를 추출하여
		 * list에 저장한 후 저장된 값들 중 최대값과 최소값을 구하는 코드를 작성
		 */
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add((int)(Math.random()*30+1));
		}
		int max = Collections.max(list);
		int min = Collections.min(list);
		/*
		int max=list.get(0);
		int min=list.get(0);
		
		for(int i = 0; i<10; i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
			if(min>list.get(i)) {
				min=list.get(i);
			}
		}
		*/
		
		System.out.println("무작위 리스트");
		System.out.println(list);
		System.out.printf("최대값 : %d\n",max);
		System.out.printf("최소값 : %d\n",min);
	}

}
