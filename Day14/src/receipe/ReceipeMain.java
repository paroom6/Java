package receipe;

public class ReceipeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Receipt receipt = new Receipt(); 추상클래스는 직접 객체를 생성할 수없다.
		
		PastaReceipt pr = new PastaReceipt("최연석");
		pr.info();
		pr.makeSource();
		
		SteakRecipt sr = new SteakRecipt("이현복");
		sr.info();
		sr.grillStake();

				
	}

}
