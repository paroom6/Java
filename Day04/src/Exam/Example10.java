package Exam;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * 두과목 평균이 70이상이면합격
		 * 70미만이거나 한 과목이 50미만이면 불합격으로 처리
		 * 
		 */
		int kor = 40, eng = 20;
		double avg = (kor+eng)/2.0;
		
		if(kor<50||eng<50) {
			System.out.println("50점 미만의 과목이 있으므로");
			System.out.println("불합격");
		}else if(avg>=70) {
			System.out.println("평균이 70점 이상이므로");
			System.out.println("합격");
		}else {
			System.out.println("평균이 70점 미만이므로");
			System.out.println("불합격");
		}
	}

}
