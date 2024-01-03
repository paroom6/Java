package Circle;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;
		pizza = new Circle();
		pizza.radius=10;
		pizza.name="불고기 피자";
		System.out.println(pizza.name+"의 면적은 "+pizza.getArea());
		Circle donut = new Circle();
		donut.radius=2;
		donut.name="플레인베이글";
		double area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+ area);
	}
	
}
