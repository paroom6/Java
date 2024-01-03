package Exam;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		int b=10;
		int max=0;//최대값
		int min=0;//최소값
		 if(a>b) {
			 max=a;
			 min=b;
		 }else {
			 max=b;
			 min=a;
		 }
		 System.out.println("최대값 : "+max);
		 System.out.println("최소값 : "+min);

	}

}
