package Exam;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * replace() 메소드 또는 replaceAll메소드
		 * - 특정 문자열 혹은 문자열을 원하는 단어로 변경해준다.
		 * 
		 */
		String str= "자바 프로그래밍은 어렵지만 자바를 배울수록 재밌습니다.";
		String newStr = str.replaceAll("자바", "Java");		
		System.out.println(str);
		System.out.println(newStr);
		
	}

}
