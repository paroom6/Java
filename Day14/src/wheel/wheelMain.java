package wheel;

public class wheelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new FourWheelBike("윤기");//부모의 클래스에 자식의 호출자
		b.Info();
		b.ride();
		//b.addWheel(); 부모타입은 호출이 불가하다.
		System.out.println();
		/*
		 * 부모 객체를 자식 타입으로 다시 변환해 줌으로써 부모타입에서는
		 * 사용하지 못했던 멤버를 쓸수있다.
		 */
		FourWheelBike fwb = (FourWheelBike) b;
		fwb.addWheel();
		fwb.Info();
		fwb.ride();
		// ((FourWheelBike) b).addWheel();
		/*
		 * 반드시 부모 타입으로 자동 타입 변환되었던 자식객체를
		 * 다시 자식 타입으로 변환 때만 강제 타입 변환 할 수 있다.
		 */
	}

}
