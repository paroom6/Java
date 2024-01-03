package Exam;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * throws 예외 던지기
		 * 메소드 내부에서 예외가 발생할 것을 대바하여 
		 * try-catch 블록으로 예외를 처리한다.
		 * 그러나 경우에 따라서는 throws 키워드를
		 * 통해 메소드를 호출한 곳으로 예외를 떠넘길 수 있다.
		 * 
		 * 
		 */
		try {
			findClass();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("존재하지 않는 클래스입니다.");
		}
		
	}
	public static void findClass() throws ClassNotFoundException{
		Class cla = Class.forName("Java.lang.string");
		//
		findClass();
	}

}
