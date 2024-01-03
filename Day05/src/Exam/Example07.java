package Exam;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 반복문
		 * 프로그램에서 똑같은 명령을 일정횟수만큼 반복하여 수행하도록 제어하는 명령문
		 * 형식
		 * for(초기식;조건식;증감식){
		 *  실행문
		 * } 
		 * 초기식 실행
		 * 조건식 실행
		 * 실행문 실행
		 * 증감식 실행
		 * 조건식 판별
		 * 실행문 실행~부합하지 않을 때 까지
		 * 부합하지 않으면 반복문 종료
		 * 
		 * 디버깅
		 * 컴퓨터 프로그램 개발 단계중에 발생하는 시스템의 논리적인 오류나 
		 * 비정상적인 버그를 찾아내고 수정하는 과정
		 * 
		 * 
		 * do while
		 * 
		 */
		
		for(int i=0; i<10; i++) {
			System.out.println("Hello Wolrd!"+(i+1));
		}
		System.out.println("===================");
		for(int i = 1; i<=100; i++) {
			System.out.println(i);
		}
		
	}

}
