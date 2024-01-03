package exam;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 증감연산자(++,--)
		 * ++:1증가
		 * --:1감소
		 * int a =10;
		 * a++, a-- :a를 사용하고 1 증감 : 다음 라인에서 변수를 1증감
		 * ++a, --a :1증감 하고 a를 사용 : 그 라인에서 변수를 1증감
		 * 변수명 앞에 증감연산자가 있을경우 전위증감
		 * 변수명 뒤에 증감연산자가 있는 경우 후위증감
		 * */
		int a =10;
		int b = 10;
		System.out.println("a = "+ ++a);
		System.out.println("b = "+ b++);
		System.out.println("a = "+ a + ", b = "+b);
		
		int n1=1;
		int n2=1;
		int result1 = --n1;
		int result2 = n2--; // n2를 저장하고 --처리
		System.out.println(result1);
		System.out.println(result2);
	}

}
