package wheel;

public class Bike {
	String riderName;
	int wheel = 2;
	Bike(String riderName){
		this.riderName=riderName;
	}
	void Info() {
		System.out.printf("%s의 자전거는 %d발 자전거입니다.\n",riderName,wheel);
	}
	void ride() {
		System.out.println("씽씽");
	}

}
