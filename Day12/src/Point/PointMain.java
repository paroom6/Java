package Point;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		ColorPoint cp = new ColorPoint();
		p.setX(1);
		p.setY(2);
		p.showPoint();
		System.out.println();
		
		cp.setX(3);
		cp.setY(4);
		cp.setColor("빨간색");
		cp.showPoint();
		System.out.println();
		
 	    cp.showColorPoint();

	}

}
