	package Computer;

public class ComputerMian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com= new Computer("인텔 i7-8700",85000);
		System.out.println(com.cpu);
		System.out.println(com.ram);
		
		Computer com1= new Computer("i5-12500H",470000);
		System.out.println(com1.cpu);
		System.out.println(com1.ram);

	}

}
