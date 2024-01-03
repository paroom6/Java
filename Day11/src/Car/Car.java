package Car;

public class Car {
	String company="삼성자동차";
	String model;
	String color;
	int maxSpeed;
	public Car() {
		
	}
	
	public Car(	String model,String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed=maxSpeed;
	}
	public Car(	String model,String color) {
		this.model = model;
		this.color = color;
	}
}
