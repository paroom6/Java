package Exam;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coffee =10;
		while(true) {
			System.out.println("돈을 받고 커피를 판매");
			coffee--;                     
			System.out.println("남은 커피의 개수는 "+coffee+"개 입니다.");
			if(coffee==2) {
				System.out.println("남은 커피 "+coffee+"개는 나의 몫 ");
				break;
			}
		}

	}

}
