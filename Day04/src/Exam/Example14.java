package Exam;

public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 문자열String비교 
		 * equals()
		 * 모든 클래스는 object를 상속받는다.
		 * 두개의 문자열이 동일한지 아닌지 판단
		 * 
		 * 
		 */
		String str1 ="Hello";
		String str2 ="World";
		String str3 ="Hello";
		if(str1.equals(str2)) {
			System.out.println("str1=str2");
		}else if(str1.equals(str3)) {
			System.out.println("str1=str3");
		}
		
		
		
	}

}
