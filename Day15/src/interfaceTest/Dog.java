package interfaceTest;

public class Dog implements Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("강아지 움직임");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("강아지 밥먹음");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!!");
	}
	
}
