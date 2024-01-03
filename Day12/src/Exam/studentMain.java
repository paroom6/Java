package Exam;

class Student{
	public String name;
	public int age;
	public double height;
	
	public Student(String name,int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
	}
	
}

public class studentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("조성민",23,158.8);
		Student student2=new Student("홍길동",20,178.5);
		student1.info();
		System.out.println();
		student2.info();
	}

}
