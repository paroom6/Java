package Test1;

public class TestMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.public_name = "홍길동";
		System.out.println(test.public_name);
		
		test.protected_name="고길동";
		System.out.println(test.protected_name);
		
		test.default_name="옥자";
		System.out.println(test.default_name);
		
		test.setPrivate_name("순자");
		System.out.println(test.getPrivate_name());
	}

}
