package Exam;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/* 논리 연산자
			 * &&,||,^,!
			 * &&: 논리곱, 두 항이 모두 true면 true 나머지는 false
			 * ||: 논리합, 두 항중 하나라도 true면 true 모두 false면 false
			 * ^:베티적 논리합, 두합이 다른 값이면 true 값으면 false
			 * !:논리부정, 식이 true먄 false false면 true   
			 */
			boolean b1 = true;
			boolean b2 = false;
			boolean b3 = true;
			boolean b4 = false;
			System.out.println("논리곱");
			System.out.println(b1&&b2);
			System.out.println(b1&&b3);
			System.out.println(b2&&b4);
			System.out.println();
			
			System.out.println("논리합");
			System.out.println(b1||b2);
			System.out.println(b1||b3);
			System.out.println(b2||b4);
			System.out.println();
			
			
			System.out.println("베타적 논리합");
			System.out.println(b1^b2);
			System.out.println(b2^b4);
			System.out.println();
			
			System.out.println("논리부정");
			boolean power = false; // 전원 off
			System.out.println(power);
			power = !power;
			System.out.println(power);
			
	
	}

}
