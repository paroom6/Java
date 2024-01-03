package Exam;

public class Example10 {
	public static void main(String[] args) {
		/*
		 * hashCode
		 *객체를 식별하는 Integer 값
		 *객체가 갖고 있는 데이터를 어떤 알고리즘에 적용하여 
		 *계산된 정수 값을 hashCode라 한다
		 *hashCode가 다르면 두 객체는 같지않다.
		 *hashCode가 같으면 두 객체는 같거나 같지않을 수 있다.
		 */
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "apple";
		System.out.println("str1 hashCode : "+System.identityHashCode(str1));
		System.out.println("str2 hashCode : "+System.identityHashCode(str2));
		System.out.println("str3 hashCode : "+System.identityHashCode(str3));
	}
}

