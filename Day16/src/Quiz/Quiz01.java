package Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다음 1~100 사이의 숫자를 맞추는 게임을 실행하던 도중
		 * 숫자가 아닌 문자열을 넣어서 에러가 발생했다
		 * 예외처리를 해서 숫자가 아닌 값을 입력했을때 다시 입력받도록 보완하세요
		 */
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		int count = 0;
		while(true) {
			try {
				System.out.println("숫자를 입력");
				int num = sc.nextInt();
				count++;
				if(num>com) {
					System.out.println("Down");
				}else if(num<com) {
					System.out.println("Up");
				}else if(num==com) {
					System.out.println("정답");
					System.out.println("지금까지 "+count+"회 입력하셨습니다.");
					break;
				}
			}catch (Exception e) {
				// TODO: handle exception
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다.");
			}
			sc.nextLine();
		}
		sc.close();
	}

}

