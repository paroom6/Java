package Exam;

public class Example02 {
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		a=20;
		System.out.println(a);
		final int a1 = 10;
		System.out.println(a1);
		//a1=20;
		System.out.println(a1);
	}
	/*
	 * final 클래스와 final 메소드
	 * 처음 정의된 상태가 변하지 않는다.
	 * 
	 * final 키워드는 클래스, 필드, 메소드 선언시 사용 할 수 있다.
	 * final 필드: 초기값 설정 후 수정될 수 없는 필드
	 * final 클래스 : 상속할 수 없는 클래스= 자식클래스를 가질 수 없다.
	 * final 메소드 : 오버라이딩 할 수 없다. 
	 */
}
