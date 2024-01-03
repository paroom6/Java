package exam;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 산술연산자
		 * 산술연산자는 사칙연산자와 나머지연산자가 있다.
		 * 정수,실수등의 숫자를 연산할때사용
		 * 피연산자의 자료형이 일치하지 않을 경우 크기가 큰 자료형으로 자동형변환이 일어난 후 연산 실행
		 * 연산결과값이 자료형 범위안에 있어야하고 넘을 경우 오버플로우, 쓰레기값이 출력된다.
		 * 
		 * */
		int x =100;
		int y =200;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		double a = 1.2345;
		int b =6;
		System.out.println(a+b);
		int result = 1000000*1000000;
		System.out.println(result);
		long resulta = 1000000L*1000000L;
		System.out.println(resulta);
	}

}
