package Exam;
class Animal{
	public void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
class Bird extends Animal{
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}

public class Example03 {
	/*
	 * 다형성이란 
	 * - 하나의 객체가 여러가지 타입을 가질 수 있다.
	 * - 자바에서는 이러한 다형성을 부모 클래스 타입의 참조 변수로
	 * 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하여 구현한다.
	 * - 다형성을 활용하면 부모 클래스가 자식클래스의 동작 방식을 
	 * 알 수 없어도 오버라이딩을 통해 자식 클래스에 접근할 수 있다.
	 * 
	 * 다형성의 조건
	 * - 반드시 상속관계여야한다.
	 * - 다형성이 보장되기위해 오버라이딩이 반드시 필요하다
	 * - 자식클래스의 객체가 부모클래스의 타입으로 형변환 해야 한다.
	 * 
	 * 객체의 재사용성이 높아지고 유지보수가 편하다.
	 */
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		animal1.sound(); // 자식객체가 부모타입으로 형변환 되었을 때 다형성이 된다.
		Animal animal2 = new Cat();
		animal2.sound();
		Animal animal3 = new Bird();
		animal3.sound();
		
	}
}
