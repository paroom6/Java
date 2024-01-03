package Exam;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * indexOf()
		 * 저장된 문자열 중에서 찾는 특정단어 또는 문장의 시작위치를 알려주는 메소드
		 * 중복된 단어가 있으면 indexOf() 메소드는 처음 검색되는 단어의 위치를 나타낸다.
		 */
		String str = "Hello World_MyWorld";
		System.out.println("Wolrd 단어 위치 : "+str.indexOf("World"));
		//몇 번째 위치부터 검색할지 지정가능
		// 10번째위치
		System.out.println("World 단어위치 : "+str.indexOf("World", 10));
		String indexOfTest="Hello World";
		System.out.println(indexOfTest.indexOf("o"));
		System.out.println(indexOfTest.indexOf(" "));
		System.out.println(indexOfTest.indexOf("o",5));
		
		
	}

}
