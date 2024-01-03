package Exam;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("abc");
		
		//문자열 추가 - append의 경우 뒤에 차곡차곡 쌓인다.
		System.out.println(sb.append("bbb"));
		System.out.println(sb.append("ccc"));
		System.out.println(sb.insert(2, "after"));
		
		//문자열 삭제
		System.out.println(sb.delete(5, sb.length()));

		//문자열 뒤집기 
		System.out.println(sb.reverse());
		
		

	}

}
