package Quiz;

import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s을 %s로 바꿉니다.\n",getSrcString(),getDestString());
		System.out.print(getSrcString()+"을 입력하세요 >> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환결과 : "+res+" "+getDestString()+"입니다.");
		sc.close();
	}
}
class Won2Dollar extends Converter{
	Won2Dollar(double ratio){
		this.ratio = ratio;
	}
	@Override
	protected double convert(double scr) {
		// TODO Auto-generated method stub
		return scr/ratio;
		
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}
	
}
public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar클래스를 작성하세요
		 * 실행결과
		 * 원을 달러로 바꿉니다.
		 * 원을 입력하세요 >> 24000
		 * 변환결과 : 20.0 달러
		 * 
		 */
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

}
