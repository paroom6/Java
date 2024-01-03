package exam;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 국어:85
		 * 수학:85
		 * 영어:75
		 * 국사:88
		 * 
		 * 네과목의 합계와 평균을 출력
		 * 
		 */
		int korean =85;
		int math =85;
		int english =75;
		int history =88;
		int sum = korean+math+english+history;
		double aver = (korean+math+english+history)/4;
		double aver1 = sum/4;
		
		System.out.println("합계: "+sum);
		System.out.println("평균: "+aver);
		
	}

}
