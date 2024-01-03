package exam;

public class example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 부호연산자
		 * +를 적용한 경우에는 부호를 유지한다.
		 * -를 적용한 경우에는 부호를 변경한다.
		 * 
		 * 부호연산자를 적용한 변수는 int타입이 되므로 
		 * short타입에 저장할 경우 컴파일 에러가 발생한다.
		 * 
		 *  부호연산자로 리터럴의 부호를 변경할때 부호정보변경은 int 타입으로 처리된다.
		 * */
		int a = -10;
		int result1 =+a;
		int result2 =-a;
		System.out.println(result1);
		System.out.println(result2);
	}

}
