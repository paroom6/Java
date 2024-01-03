package Car;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		System.out.println("회사명 : "+car.company);
		System.out.println();
		
		Car car1 = new Car("SM5","검정",200);
		System.out.println("회사명 : "+car1.company);
		System.out.println("모델명 : "+car1.model);
		System.out.println("색상 : "+car1.color);
		System.out.println("최고속도 : "+car1.color);
		System.out.println();
		Car car2 = new Car("소나타","흰색");
		System.out.println("회사명 : "+car2.company);
		System.out.println("모델명 : "+car2.model);
		System.out.println("색상 : "+car2.color);
	}

}
