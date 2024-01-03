package interfaceTest;

public class Cat implements Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("고양이 움직임");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("고양이 밥먹음");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("야옹!!~~");
	}
	
}
