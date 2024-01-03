package exam;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * Scanner()
	 * 사용자가 데이터를 입력받을때 사용하는 클래스 형식 
	 * Scanner scanner = new Scanner(System.in);
	 * scanner.nextByte(); byte형 입력및 리턴
	 * scanner.nextShort(); short형 입력및 리턴
	 * scanner.nextInt(); int형 입력및 리턴
	 * scanner.nextLong(); long형 입력및 리턴
	 * scanner.nextFloat(); float형 입력및 리턴
	 * scanner.nextDouble(); double형 입력및 리턴
	 * scanner.next(); String형 입력 및 리턴- 공백을 기준으로 단어하나를 읽어들임
	 * scanner.nextLine(); String형 입력 및 리턴-개행을 기준으로 한줄을 읽어들임
	 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt(); 
		System.out.println("입력받은 값: "+num);
		
		System.out.print("숫자입력: ");
		double doubleNum = sc.nextDouble(); 
		System.out.println("입력받은 값: "+doubleNum);
		
	}
	

}
