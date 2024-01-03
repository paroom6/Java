package exam;

class Coffee{
	public void make() {}
}

public class Example06 {
	public static void main(String[] args) {
		/*
		 * 익명클래스
		 * - 이름이 없는 클래스를 의미
		 * - 클래스의 선언과 객체의 생성을 동시에 하므로 단 한번만 
		 * 사용할 수 있고 오직 하나의 객체만을 생성할 수 있는 
		 * 일회용 클래스 
		 * - 윈도우 개발(swing) 혹은 안드로이드 ui구성 및 
		 *   사용자 이벤트 시스템을 구현시 사용된다
		   
		   사용자 이벤트란?
		   - 마우스 클릭, 드래그 등 !!
		 */
		
		// Coffee 클래스를 상속 받는 익명 클래스 
		Coffee coffee = new Coffee() {
			@Override
			public void make() {
				System.out.println("Override Make!!~~");
			}
			
			/*
			 * new Coffee()를 통해 생성되는 인스턴스는
			 * Coffee 클래스가 아닌 상단에 Coffee 클래스를 
			 * 상속받는 익명 클래스이기 대문에 
			 * Coffee 클래스 안에 serve() 메소드가 선언되어 
			 * 있지 않기 때문
			 */
			public void serve() {
				System.out.println("serve");
			}
		};
		coffee.make();
		//coffee.serve();
	}
}
