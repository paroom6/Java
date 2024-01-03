package Exam;
class TV{
	private int size;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public TV(int size) {
		this.size = size;
	}
}

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *다음 TV클래스가 있고 main() 메소드의 실행 결과를 
		 *참고하여 TV클래스를 상속받은 colorTV클래스를 
		 *작성하세요
		 *
		 *실행결과)
		 *32인치 검정색
		 */
		ColorTV myTV = new ColorTV(32,"검정색");
		myTV.printProperty();
	}

}
