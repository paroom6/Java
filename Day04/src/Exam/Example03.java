package Exam;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 삼항 연산자
		 * 피연산자를 3개나 가지는 식
		 * 코드를 간결하게 표현 가능
		 * 조건식 ? 피연산자1 : 피연산자2
		 * 복잡한 조건을 구현하기 힘듬
		 * 단순한 조건이 걸린 문제의 경우 삼항연산자
		 * 복잡한 조건의 경우 if else문으로 처리하는 것을 권장
		 */
		boolean result = (10<20)?true:false;
		System.out.println(result);
		int num = (7<1)?1:0;
		System.out.println(num); 
		
		if(result){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
		
			
		
	}

}
