package exam;

public class Eaxmple03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int intvar = 48149; //박의 유니코드정수값
			char charvar = (char)intvar;
			System.out.println(charvar);
			intvar = 300;
			byte bytevar = (byte) intvar;
			System.out.println(bytevar); //byte 값을 넘어서 값이 바뀜
			
			double doublevar = 3.14;
			intvar = (int)doublevar; // 소숫점이하 소실
			System.out.println(intvar);

	}

}
