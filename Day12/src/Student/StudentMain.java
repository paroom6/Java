package Student;
class Student{
	static String schoolname ="코리아아카데미";
	String studentName;
	public static void info() {
		// 스태틱메소드 
		System.out.println("Hello World");
	}
}
public class StudentMain {
	public static void main(String[] args) {
		/*
		 * 정적멤버 static
		 * -객체 생성없이 사용가능
		 * 고정된이라는 의미를 가지고 있다
		 * 앞에 static 이 붙으면 static 변수나 메소드가 된다
		 * 일반적인 인스턴스 변수들과 달리 프로그램 실행이 static 영역에 메모리가 올라간다
		 * -스태틱이라는 키워드를 사용하면 static 변수와 static메소드를 만들수있다.
		 * -정적필드,정적메소드라고 하며 이 둘을 합쳐 정적멤버라고 한다.
		 * -정적멤버는 클래스에 고정된 멤버 Heap영역이 아닌 static영역에 할당된다.
		 * -static영역에 할당된 메모리는 모든 객체가 공유하여  하나의 멤버를 어디든지
		 * 참조할 수 있는 장점을 가지지만 가비지 컬렉터 관리 영역 밖에 있으므로 프로그램이 
		 * 종료시까지 메모리가 할당된 채로 존재한다.
		 * 
		 */
		Student stu = new Student();
		Student.info();
		//스태틱명은 클래스명으로 접근한다.
		stu.info();
		stu.studentName="조성민";
		
			
	}
	
}
