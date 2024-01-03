package exam;


class Car{
	// alt shift s

	private int speed;
	private boolean stop;
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
			return;
		}else {
			this.speed = speed;
		}
	}
	/*
	 * 넘어온 값이 값이 음수라면 0으로 만들고 종료
	 */
	
}

public class CarExample {
	public static void main(String[] args) {
		Car myCar= new Car();
		myCar.setSpeed(-100);
		System.out.println("현재속도 : "+myCar.getSpeed());
		myCar.setSpeed(100);
		System.out.println("현재속도 : "+myCar.getSpeed());
		
	}
}
