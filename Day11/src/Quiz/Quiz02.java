package Quiz;

import java.util.Scanner;

class Man{
	public String name;
	public int age;
	public String gender;
	
	public void info() {
		System.out.println("이름 : "+ name );
		System.out.println("나이 : "+ age );
		System.out.println("성별 : "+ gender);
	}
}

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man me = new Man();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 >>> ");
		me.name = sc.nextLine();
		System.out.println("나이 >>>");
		me.age = sc.nextInt();
		sc.nextLine(); 
		System.out.println("성별 >>>");
		me.gender = sc.nextLine();
		me.info();

	}

}
