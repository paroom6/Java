package Book;

public class BookMian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Comic클래스에서는 구현하지 않은 멤버와 메소드지만
		 * Book의 요소들을 사용할 수 있다.
		 * Book 클래스를 상속받았기 때문
		 */
		Comic comicBook = new Comic();
		comicBook.title="포켓몬스터";
		comicBook.price=4500;
		comicBook.info();
		

	}

}
