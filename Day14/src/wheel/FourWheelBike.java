package wheel;

public class FourWheelBike extends Bike{
	FourWheelBike(String riderName){
		super(riderName);
	}
	void addWheel() {
		if(wheel==2) {
			wheel=4;
			System.out.println(riderName+"의 자전거에 보조 바퀴를 부착했습니다.");
		}else {
			System.out.println(riderName+"의 자전거에 이미 보조 바퀴가 부착됬습니다.");
		}
	}
}
