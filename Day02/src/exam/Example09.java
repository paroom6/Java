package exam;

public class Example09 {
	public static void main(String[] args) {
		/*
		 * 실수형(float, double) 
		 * 크기가 작은것 : float(4byte)
		 * 크기가 큰것 : double(8byte)
		 * 
		 * float는 소수점 7자리까지 정확하게 표현된다 
		 * double은 소수점 15자리까지 정확하게 표현된다 
		 * 
		 * 컴퓨터에서 실수를 가지고 수행하는 모든 연산에는 작은 
		 * 오차가 존재함 자바뿐 아니라 모든 프로그래밍 언어에서 
		 * 발생하는 기본적인 문제 
		 */
		double pieDouble = 3.141592653589793;
		System.out.println(pieDouble);
		
		float pieFloat = 3.1415923f;
		System.out.println(pieFloat);
		
		double marathon = 42.195;
		float halfMarathon = 21.0975F;
		
		System.out.println("마라톤은 " + marathon 
				+ "km를 달린다");
		System.out.println("하프 마라톤은 " + halfMarathon
				+ "km를 달린다");
		
	}
}
