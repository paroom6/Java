package Car;

public class Car {
	int wheel=4;
	/*
	 * 생성자
	 * new 클래스명()
	 * 직접 선언하지 않아도 기본 생성자가 자동으로 생성
	 * 생성자를 통해 객체변수를 초기화한다
	 * 값을 초기화 하는 뜻이 아닌 필드와 메소드를 호출하는 등
	 * 객체를 사용하기 위해서 객체변수가 메모리에 올라가야하는데 
	 * 이렇게 메모리에 객체변수를 올려주는 역활을 생성자가 하고있다.
	 */
	public Car() {
		
	}
	/*
	 * 메소드
	 * -리턴값이 있는 함수
	 * 	int`변수타입` 메서드명(){
	 * 			return 변수
	 * 	}
	 * -리턴값이 없는 함수
	 *  void 메서드명(){
	 *  	코드
	 *  }
	 */
	void ride() {
		System.out.println("달린다");
	}
	void stop() {
		System.out.println("멈춘다");
	}

}
