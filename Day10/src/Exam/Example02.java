package Exam;

public class Example02 {
	public static void printHello() {
		System.out.println("Hello Java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 메소드(Method)
		 * - 클래스 안에서 특정 기능을 수행하기 위해 코드들을 
		 * 따로 하나의 블록으로 묶어놓은 것
		 * - 메소드를 사용하면 같은 내용의 코드를 반복적으로 
		 * 사용하는 것을 피할 수 있다
		 * 즉) 반복되는 문장들을 묶어서 처리하몀 필요할때만다
		 * 재사용 가능하며 중복코드를 제거가능하다.
		 * 형식)
		 * 접근제한자 반환타입 메소드이름(){
		 *  실행코드
		 *  }
		 * 접근제한자: public, protected, private, default
		 * - 변수나 메소드에 적용가능
		 * public:모든 패키지, 클래스에서 접근가능
		 * protected: 같은 패키지에서만 접근가능,
		 *  다른 패키지에서 접근하기 위해서는 해당 클래스를 상속받아야한다
		 * private: 같은 클래스에서만 접근가능:클래스 외부접근불가
		 * default: 같은 패키지만 접근가능 
		 * 
		 * 
		 */
		printHello();

	}

}
