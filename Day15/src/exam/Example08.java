package exam;

public class Example08 {
	/*
	 * 에러(Error)와 예외(Exception) 차이 
	 * 
	 * 에러(Error)
	 * - 시스템이 종료되어야 할 수준의 상황과 같이 수습할 수 없는 
	 * 심각한 문제를 의미 
	 * 
	 * 예외(Exception)
	 * - 개발자가 구현한 로직에서 발생한 실수나 사용자의 영향에 의해 
	 * 발생한다
	 * - 자바는 객체지향 언어이기 때문에 프로그램에서 발생하는 예외들은
	 * 클래스의 형태로 제공한다 
	 * - 예외는 체크예외(Check exception)와 
	 * 비체크예외(Unchecked exception) 두 가지가 있다 
	 * 
	 * 체크예외 : IOException(파일입출력), SQLException(db연동)
	 * 비체크예외 : NullPointerException, NumberFormatException 등등
	 */
	public static void main(String[] args) {
		try {
			// 예외가 발생할 수 있는 코드를 작성
			System.out.println(4/0);
		} catch(ArithmeticException e) {
			// 예외처리 코드
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
