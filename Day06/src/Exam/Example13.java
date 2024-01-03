package Exam;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * continue 문
		 * 반복문 안에서 continue문을 만나면
		 * 이후의 실행코드는 수행되지 않고 처음으로 돌아가 반복문 재실행
		 *	1~100까지의 홀수구하기	
		 */
		int i=0;
		while(i<100) { // 1~99까지의 홀수구하기가 된다.
			i++;
			if(i%2==0) {
				continue;
			}
			System.out.println(i);

		}
		
	}

}
