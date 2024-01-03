package Exam;

import java.util.StringTokenizer;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StringTokenizer
		 * 문자열을 특정 구분자로 분리할때 사용
		 */
		String txt = "서울/부산/대구/인천/광주/대전/울산";
		StringTokenizer tokens = new StringTokenizer(txt,"/"); 
				while(tokens.hasMoreTokens()) {
					System.out.println(tokens.nextToken());
				}
	}

}
