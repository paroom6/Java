package Exam;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 중첩 반복문
		 * 바깥쪽 반복문과 안쪽 반복문이 독립적으로 반복을 수행하는 독립적 중첩반복문
		 * 바깥쪽 반복문과 안쪽 반복문이 서로 영향을 받아 반복을 수행하는 종속적 중첩반복문
		 * 
		 * for(초기식; 조건식; 증감식;){
		 * 		for(초기식; 조건식; 증감식;){
		 * 			실행문
		 * 		}
		 * } 
		 * 3중첩 이상 넘어갈 경우 효율이 나빠진다
		 * 반복문이 중첩될 수록 반복문을 위한 연산의 부하가 커진다.
		 */
		// 바깥쪽 for문은 다음 본복으로 넘어가기 위해 안쪽의 for문을 모두 수행해야한다
		
		 for(int i =2; i <=9; i++) {
			 for(int j = 1; j<=9; j++) {
				 System.out.println(i+" X "+j+" = "+(i*j));
			 }
		 }

		
	}

}
