package Exam;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StringBuilder()
		 * String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아닌
		 * 기존데이터에 더하는 방식을 사용하기 때문에 속도가 빠르고 
		 * 상대적으로 부하가 적다
		 */
		StringBuilder str = new StringBuilder();
		str.append("Hello");
		str.append(" World");
		System.out.println(str);
	}

}
