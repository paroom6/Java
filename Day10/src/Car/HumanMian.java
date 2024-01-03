package Car;

public class HumanMian {

	public static void main(String[] args) {
		// 인스턴스 이름으로 접근
		Human human= new Human();
		human.name="조성민";
		human.age=23;
		human.address="부산진구 양정동";
		System.out.println("이름 : "+human.name);
		System.out.println("나이 : "+human.age);
		System.out.println("주소 : "+human.address);
		System.out.println();
		Human human1 = new Human();
		human1.name="홍길동";
		human1.age=30;
		human1.address="부산시 사하구";
		System.out.println("이름 : "+human1.name);
		System.out.println("나이 : "+human1.age);
		System.out.println("주소 : "+human1.address);
	// human 인스턴스와 human1 인스턴스는 서로 영향을 주지않는다.
	}
	
}
