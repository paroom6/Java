package book;

public class Comic extends Book {
	public boolean isColor;
	public Comic(String title, String author,boolean isColor) {
		super(title, author);
		this.isColor = isColor;
		// TODO Auto-generated constructor stub
	}

	/*
	void info_title() {
		
	}
	*/
	// override
	public void info_author() {
		System.out.printf("책의 작가는 %s 입니다.\n",author);
	}
	public void info_isColor() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		}else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
	
}
