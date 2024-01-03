package Exam;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Getter와 Setter 메소드
		 * 객체 지향 프로그래밍에서 객체의 데이터는 객체의 외부에서
		 * 직접적으로 접근하는것을 막느다
		 * 객체의 데이터를 외부에서 마음대로 읽고 변경할 경우
		 * 객체의 무결성이 깨짐
		 * 객체의 무결성을 유지하기위헤 메소드를 통해 데이터를 
		 * 변경하게 하여 검증된 값만 데이터로 저장할 수 있게 함
		 * 
		 * private 필드의 값을 대입하는 방법으로는 Setter 메소드를 사용한다
		 * private 필드의 값을 호출하는 방법으로는 Getter 메소드를 사용한다
		 */
		Book book1 = new Book();
		Book book2 = new Book();
		book1.setTitle("자바의 정석");
		book1.setAuthor("남궁성");
		
		book2.setTitle("리액트");
		book2.setAuthor("김민준");
		
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		System.out.println("==============");
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());
		
		}

}
