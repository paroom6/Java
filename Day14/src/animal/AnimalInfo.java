package animal;
class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}
public class AnimalInfo {
	public void moveAnimal(Animal animal) {
		animal.move();//다형성을 가지고 있음
	}
	public static void main(String[] args) {
		AnimalInfo info = new AnimalInfo();
		info.moveAnimal(new Human());
		info.moveAnimal(new Tiger());
		info.moveAnimal(new Eagle());
	}
}
