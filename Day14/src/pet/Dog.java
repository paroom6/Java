package pet;

public class Dog extends Pet {
// 추상 클래스를 상속받았으니(추상메소드가 있으니) 추상 메소드로 선언하거나 오버라이딩 해야한다.
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Dog walk");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eat");
	}

}
