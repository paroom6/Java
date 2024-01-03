package Exam;

public class Student {
	// 필드(field) : 객체의 데이터가 저장된다.
	String name;
	//생성자 : 객체 생성시 초기화 역활
	//new 연산자로 객체가 생성될 때 호출된다.
	//클래스명으로 되어있고 반환타입은 없다 
	Student(){
		//생성자를 만들때는 반드시 해당 클래스의 이름과 동일해야한다.	
		//빈 생성자는 생략가능
	}
	//메소드 : 객체의 행위(동작)에 해당된다
	//객체간의 데이터 전달의 수단으로도 사용된다.
	void study() {
		System.out.println(name+"공부한다");
	}
}
