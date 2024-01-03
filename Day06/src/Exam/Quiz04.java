package Exam;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
			사용자는 이 숫자를 맞추어야 합니다.
			입력한 숫자보다 정답이 크면 → "UP" 출력,
			입력한 숫자보다 정답이 작으면 → "DOWN" 출력.
			정답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.
		 */
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		int count = 0;
		while(true) {
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
		sc.close();
		}
		
	}

}
