package Exam;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열에서 단어만 추출하여 출력하기
		 * 실행결과)LOVE
		 */
		char[] cards = {'1','L','O','2','V','3','E'};
		for(int i =0; i<cards.length; i++) {
			if(cards[i]>=65&&cards[i]<=90) { //아스키 코드 A~Z까지
				System.out.printf("%c",cards[i]);
			}
		}
	}

}
