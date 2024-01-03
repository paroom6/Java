package Exam;

public class Example02 {
	public static void main(String[] args) {
		String[] strArray = null;
		try {
		System.out.println("strArray[0] = "+strArray[0]);
	
		}catch (NullPointerException e) {
			System.out.println("strArray 배열이 null 이므로 개체 배열에서 로드 할 수 없습니다.");
		}
	}
}
