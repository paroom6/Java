package Exam;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Math.random() 메소드를 이용해 두개의 주사위를 던졌을때 나오는눈을 (눈1,눈2)로 출력
		 * 눈의 합이 5가 아니면 반복 5이면 정지하는 코드
		 *  
		 */
		
		while(true) {
			int i = (int)(Math.random()*6)+1;
			int j = (int)(Math.random()*6)+1;
			System.out.printf("(%d,%d)\n",i,j);
			int sum = i+j;
			if(sum == 5) {
				break;
			}
		}
	}
 
}
