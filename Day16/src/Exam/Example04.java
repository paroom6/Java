package Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * 다중 예외처리
		 */
		Scanner sc = new Scanner(System.in);
		int[] cards = {4,5,1,2,7,8};
		try {
			System.out.println("몇 번째 카드를 뽑으시겠습니까 >> ");
			int cardsIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호 : "+cards[cardsIndex]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("해당 번호의 카드는 없습니다.");
				// TODO: handle exception
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("숫자만 입력 가능합니다.");
			}
		}


}
