package Exam;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 무한루프 
		 * 무한이 반복되는 제어문
		 * 특정조건을 걸지 않으면 계속 반복된다.
		 * 루프 탈출조건을 걸어야한다.
		 */
		int i=0;

		while(true) {
			if(i==10) {
				break;
			}
			i++;
			System.out.println(i);
		}
		/*
		 * for 문의 경우 구하고자 하는 값의 조건이 명확할 경우 사용하는 편이 좋다
		 * - 초기값 조건식 증감식이 블록에서 바로 찾을 수 있어 가독성이 좋다
		 * while 문의 경우 구하고자 하는 값의 조건이 명확하지 않은 경우, 유동적인 경우 사용하는 편이 좋다
		 *  - 조건식이 분산되어 있어 가독성이 나쁘다
		 * 
		 */
	}

}
