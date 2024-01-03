package exam;

public class Example03 {
	public static void main(String[] args) {
		// 실수 표현
		double a = 1.1;
		System.out.printf("%f\n", a);
		System.out.printf("%f\n", 1.12);
		
		System.out.printf("%.1f\n", 1.12345678);
		System.out.printf("%.2f", 1.12345678);
		System.out.println();
		System.out.printf("%.3f", 1.12345678);
		System.out.println();
		System.out.printf("%.5f\n", 1.12345678);
		
		// 문자열
		String str = "Hello Java";
		System.out.printf("%s\n", str);
		
		// 문자
		char c = 'A';
		System.out.printf("%c\n", c);
		
	}
}
