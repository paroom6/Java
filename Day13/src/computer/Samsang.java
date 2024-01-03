package computer;

public class Samsang extends Computer{
	void powerOn() {
		/*
		 * super 키워드
		 * 부모클래스에서 상속받은 필드나 메소드를
		 * 자식클래스에서 참조하는데 사용한다.
		 * 
		 * 자식클래스가 부모클래스의 멤버와 동일한 이름을 갖고 있다면
		 * 구분해 낼 수 있어야 한다.
		 */
		super.powerOn(); // 동일한 명칭의 메소드에서 구분할때도 사용
		System.out.println("아이 러브 삼성");
	}

}
