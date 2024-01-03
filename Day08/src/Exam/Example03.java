package Exam;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * new 연산자 
		 * 객체를 heap영역에 메모리 공간을 할당해주고 메모리주소를 반환한 후
		 * 생성자를 실행시켜준다
		 * new  연산자로 생성된 객체는 똑같은 값을 가져도 다른 메모리에 할당되었기에
		 * 다른 객체로 분류된다.
		 */
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");
		if(str1==str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		

	}

}
