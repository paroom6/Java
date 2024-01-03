package Exam;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * charAt() : 문자열에서 문자 하나를 추출할 수 있는 메소드 
		 */
		String str = "abcde";
		System.out.println("str문자열의 0번째 인덱스 : "+str.charAt(0));
		System.out.println("str문자열의 1번째 인덱스 : "+str.charAt(1));
		System.out.println("str문자열의 2번째 인덱스 : "+str.charAt(2));
		System.out.println("str문자열의 3번째 인덱스 : "+str.charAt(3));
		System.out.println("str문자열의 4번째 인덱스 : "+str.charAt(4));
		String str1 ="Hello Wolrd";
		System.out.println("str1의 5번째 인덱스 : "+str1.charAt(5));
		// length() 문자열의 길이를 반환
		System.out.println(str1.length());
	}

}
