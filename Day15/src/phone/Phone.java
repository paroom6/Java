package phone;

public interface Phone {
	final int TIMEOUT = 10000; // 상수필드 선언 
	void sendCall(); // 추상메소드(public abstract 생략 가능)
	void receiveCall();
	
	/*
	 * 메소드 선언시 default를 명시하게 되면 인터페이스 내부에서도 
	 * 로직이 포함된 메소드를 선언할 수 있다 
	 */
	default void printLogo() {
		System.out.println("** Phone **");	
	}
}
