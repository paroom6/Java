package Exam;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자신의 몸무게와 키를 입력받고 BMI가 저체중인지 정상인지 과체중인지 비만인지 판별하는 프로그램 작성
		 * 18.5<=저체중
		 * 18.5~22.9 정상
		 * 22.9~24.9 과체중
		 * 25.0 비만
		 * BMI=몸무게(kg)/(신장(m)*신장(m))
		 * 몸무게와 키는 실수로 입력 받음
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몸무게(kg)를 입력하세요");
		double kg = sc.nextDouble();
		System.out.println("키(cm)를 입력하세요");
		double cm = sc.nextDouble();
		System.out.println();
		sc.close();
		
		double m = cm/100;
		double bmi = kg/(m*m);
		
		
		if(bmi>=25.0) {
			System.out.println("비만입니다.");
		}else if(bmi>=23.0) {
			System.out.println("과체중입니다.");
		}else if(bmi>=18.5) {
			System.out.println("정상입니다.");
		}else {
			System.out.println("저체중입니다.");
		}

	}

}
