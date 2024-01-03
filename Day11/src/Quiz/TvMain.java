package Quiz;

class Tv{
	public String company;
	public int year;
	public int inch;
	public Tv(String company, int year, int inch) {
		this.company = company;
		this.year= year;
		this.inch=inch;
	}
	public void show() { 
		System.out.printf("%s에서 만든 %d년형 %d인치 TV\n",this.company,this.year,this.inch);
	}
}

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다음 에소드를 실행시켰을때 다음과 같이 출력되는 Tv클래스를 작성
		 * 
		 * LG에서 만든 2017년형 32인치 TV
		 */
		 Tv tv= new Tv("LG",2017,32); 
		 tv.show();
	}

}
