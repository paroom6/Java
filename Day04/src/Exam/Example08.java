package Exam;

public class Example08 {
	public static void main(String[] args) {
		int kor = 95;
		int eng = 46;
		double avg = (kor +eng)/2.0;
		
		if(avg >=70) {
			System.out.println("평균점수가 70점 이상이므로");
			System.out.println("합격");
		}else {
			System.out.println("평균점수가 70점 미만이므로");
			System.out.println("불합격");
		}
		
	}
}
