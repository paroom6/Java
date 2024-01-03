package exam;

import java.util.Scanner;

class MethodTest{
	public int getSum(int num1, int num2) {
		return num1+num2;
	}
	public int getSum(int num1, int num2, int num3) {
		return num1+num2+ num3;
	}
}

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 오버로딩(메소드 오버로딩.생성자 오버로딩)
		 * -한 클래스 내의 동명이지만 매개변수의 타입이나 개수가 다른
		 * 여러개의 메소드를 중복 작성가능하다. 
		 * 메소드의 이름을 통일하여 메모리를 절약가능하다	
		 * 
		 * 오버라이딩
		 * -상속관계에 있는 클래스 간에 같은 이름의 메소드를 정의하는 기능
		 *  오버라이딩 하고자 하는 메소드가 상위 클래스에 존재해야한다.
		 * - 메소드 이름이 같아야한다
		 * - 상위 메소드와 동일하거나 내용이 추가되어야한다.
		 */
		MethodTest test = new MethodTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		
		System.out.println(test.getSum(num1, num2));
		System.out.println(test.getSum(num1, num2, num3));
	}

}
