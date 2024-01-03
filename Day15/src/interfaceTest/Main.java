package interfaceTest;

public class Main {
	public static void main(String[] args) {
		/*
		 * 인터페이스의 장점
		 * - 개발시간을 단축할 수 있다 
		 * - 변경에 유리한 유연한 설계가 가능 
		 * - 표준화가 가능 
		 * - 서로 관계없는 클래스들을 관계를 맺어줄 수 있다 !! 
		 */
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.move();
		dog.eat();
		dog.bark();
		
		cat.move();
		cat.eat();
		cat.bark();
	}
}
