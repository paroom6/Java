package Test2;

import Test1.Test;

public class TestMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.public_name = "홍길동";
		System.out.println(test.public_name);
		//protected 다른 패키지므로 접근불가
		//test.protected_name="고길동";
		//System.out.println(test.protected_name);
		//default 다른패키지므로 접근 불가
		//test.default_name="옥자";
		//System.out.println(test.default_name);
		
		test.setPrivate_name("순자");
		System.out.println(test.getPrivate_name());
	}

}
