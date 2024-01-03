package computer;

public class ComputerMain {
	public static void main(String[] args) {
		Samsang s = new Samsang();
		s.powerOn();
		s.powerOff();
		System.out.println("=============");
		Computer c = new Computer();
		c.powerOn();
		c.powerOff();
	}
}
