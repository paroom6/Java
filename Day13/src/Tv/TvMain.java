package Tv;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTelevision iptv= new IPTelevision("LG");
		System.out.println("모델 : "+iptv.model);
		/*
		 * 상속된 메소드 호출
		 * 상속받은 메소드는 자식객체도 사용가능 하다.
		 */
		iptv.powerOn();
		iptv.changeChannel(59);
		iptv.settopBoxOn();
		iptv.changeContents("영화");
		iptv.changeSound(20);
		iptv.settopBoxOff();
		iptv.powerOff();
	}

}
