package Quiz;

import java.util.Scanner;

class Cal{
	public int a;
	public int b;
	public char cal;
	
	public Cal(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int calculate(char cal) {
		int answer =0;
		switch (cal) {
		case '+' :
			answer=a+b;
			break;
		case '-':
			answer=a-b;
			break;
		case '*':
			answer=a*b;
			break;
		case '/':
			answer=a/b;
			break;
		}
		return answer;
		
	}
}

public class CalMain {

	public static void main(String[] args) {
		/* 
		 * 계산기 클래스를 만들고
		 * 더하기 빼기 곱하기 나누기를 수행하는 클래스를 만드세요
		 * 
		 * int 타입의 필드 : a b
		 * int calculate() : 클래스의 목적에 맞는 연산을 실행하고 
		 * 결과를 리턴
		 * 
		 * 두 정수와 연산자를 입력하세요 >> 5 7 *
		 * 35
		 * 
		 */
		System.out.println("두 정수와 연산자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		char cal=sc.next().charAt(0);
		Cal num = new Cal(num1, num2);
		num.calculate(cal);
		
		System.out.println(num.calculate(cal));
	}

}
