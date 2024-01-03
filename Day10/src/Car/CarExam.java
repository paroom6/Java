package Car;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Car car2 = new Car();
		System.out.println("Wheel의 개수는 "+car.wheel+"개 입니다");
		car.wheel = 10;
		System.out.println("Wheel의 개수는 "+car.wheel+"개 입니다");
		car.ride();
		car.stop();
		System.out.println("Wheel의 개수는 "+car.wheel+"개 입니다");

	}

}
