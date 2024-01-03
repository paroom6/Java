package book;

public class Book {
	// final 클래스는 상속이 안된다.
	final public String title;
	public String author;
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	/*
	 * final 메소드는 오버라이딩을 금지할 때 사용한다
	 * 자식 클래스에서 자기 마음대로 변경하지 못하도록 할 때
	 */
	final void info_title() {
		System.out.printf("책의 제목은 %s 입니다.\n",title);
	}
	public void info_author() {
		System.out.printf("책의 작가는 %s 입니다.\n",author);
		
	}
}
