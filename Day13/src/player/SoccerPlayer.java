package player;

public class SoccerPlayer extends Player {
	int goalNum;
	/*
	 * super()
	 * 매개값의 개수와 타입이 일치하는 부모 생성자를 호출한다.
	 * 만약 매개값의 개수와 타입이 일치하는 부모생성자가 없는 역우
	 * 컴파일 오류
	 * 
	 * 매개값이 없는 경우, 부모의 기본생성자를 컴파일러가 자동으로 만들기에
	 * 생략가능하다.
	 */
	public SoccerPlayer(String name, int age,int goalNum) {
		super(name,age);
		this.goalNum=goalNum;
		
	}
		// 부모클래스에서 생성자를 만들었으니 자식클래스에도 같은 형식의 생성자를 작성하라
	
}
