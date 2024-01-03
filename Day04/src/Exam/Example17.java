package Exam;

public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 =new String("Hello");
		String str2 =new String("Hello");
		
		if(str1==str2) {
			System.out.println("같음");
		}else {
			System.out.println("같지않음");
		}
		if(str1.equals(str2)) {
			System.out.println("같음");
		}else {
			System.out.println("같지않음");
		}
	}

}
