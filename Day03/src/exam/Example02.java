package exam;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *자동형변환, 강제형변환
		 *자동형변환 : 작은자료형에서 큰 자료형으로 변환할때
		 *강제 형변환
		 *큰 자료형에서 작은 자료형으로 이동할때
		 *
		 *오류가 발생하지 않도록 강제로 형변환- 데이터손실 발생 예상치못한 결과가 나옴
		 *
		 * 
		 * */
		byte bytevar = 10;
		int intvar = bytevar;
		System.out.println(intvar);
		char charvar='윤';
		intvar = charvar;
		System.out.println(charvar+"의 유니코드:"+intvar);
		long longVar =727;
		float floatvar = longVar;
		System.out.println(floatvar);
	}

}
