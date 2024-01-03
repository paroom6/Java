package Exam;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 조건문
		 * 조건식의 결과에 따라 종속문장(블록내의 문장)의 실행여부가 결정
		 * 조건식의 연산결과가 true이면 블록내 문장을 실행하고 false면 실행하지 않는다
		 * if조건식에는 boolean변수 또는 true나 false값이 산출되는 식이 와야한다.
		 * else 단독으로 사용불가, if문의 실행문이 실행되면 else문은 생략된다
		 * if(조건식){
		 * 실행문
		 * }else{
		 * 실행문
		 * }
		 */
	int score = 70;
	if(score>=60) {
		System.out.println("합격");
	}else {
		System.out.println("불합격");
	}
	
	
	}

}
