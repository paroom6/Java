package book;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comic comicbook = new Comic("주머니괴물","미상",true);
		comicbook.info_title();
		comicbook.info_author();
		comicbook.info_isColor();
		
		//comicbook.title="자바의 정석";
	}

}
