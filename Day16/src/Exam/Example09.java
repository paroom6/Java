package Exam;

public class Example09 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = new String("hello");
		//변수의 위치값을 단순 비교 
		System.out.println("str1 vs str2 : "+(str1==str2));
		System.out.println("str2 vs str3 : "+(str2==str3));
		//문자열 값이 같은지 비교
		System.out.println("str1 vs str2 : "+ str1.equals(str2));
		System.out.println("str2 vs str3 : "+ str2.equals(str3));
		// 각 문자열의 변수가 있는 위치 값을 출력 
		System.out.println("str1 hashCode : "+System.identityHashCode(str1));
		System.out.println("str2 hashCode : "+System.identityHashCode(str2));
		System.out.println("str3 hashCode : "+System.identityHashCode(str3));
		
	}
}
