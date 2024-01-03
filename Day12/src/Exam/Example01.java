package Exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 향상된 for 문
		 * 배열의 길이로 for문의 반복횟수가 정해진다.
		 * for(변수타입 변수이름 : 배열이름){
		 * 코드....
		 * }
		 * 클래스는 타입으로 사용가능
		 */
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
