package Quiz;

import java.util.Scanner;

class subject{
	int math;
	int kor;
	int eng;
	public int getSum() {
		int sum=math+kor+eng;
		return sum;
	}
	public int getAvg() {
		int sum=math+kor+eng;
		int avg=sum/3;
		return avg;
	}
	public void info() {
		System.out.println("총점 : "+ getSum());
		System.out.println("평균 : "+ getAvg());
	}
}

public class Quiz01 {
	public static void main(String[] args) {
	/*
	 * 국영수3과목의 점수를 입력받아
	 * 총점과 평균을 구하는 메소드를 만드세요
	 * 총점 구하는 메소드
	 * 평균 구하는 메소드
	 * 총점과 평균을 출력하는 info메소드
	 */
		Scanner sc = new Scanner(System.in);
		subject test = new subject();
		System.out.print("국어점수 : ");
		test.kor=sc.nextInt();
		System.out.print("영어점수 : ");
		test.eng=sc.nextInt();
		System.out.print("수학점수 : ");
		test.math=sc.nextInt();
		System.out.println(test.getSum());
		System.out.println(test.getAvg());
		test.info();
				
	}
}
