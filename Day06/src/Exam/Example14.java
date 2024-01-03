package Exam;

public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 난수 생성 Math.random();
		 * double 형으로 0.0이상~1.0미만의 값을 무작위로 반환하는 함수 
		 * 난수 생성시 사용 
		 * 실수형이기에 정수형으로 강제 형변환 필요
		 */
		System.out.println(Math.random());
		
		//1~10까지의 랜덤난수
		System.out.println((int)(Math.random()*10)+1);

	}

}
