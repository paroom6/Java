package Exam;

class Employee{
	public String name;
	public int age;
	
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[]employee = new Employee[2];
		String[]name= {"조성민","홍길동"};
		int []age= {23,20};
		for(int i=0; i<employee.length; i++) {
			employee[i]=new Employee(name[i],age[i]);
		}
		for(Employee emp : employee) {
			emp.info();
		}

		
		
	}

}
