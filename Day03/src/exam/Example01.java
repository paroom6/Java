package exam;

public class Example01 {
public static void main(String[] args) {
//	스택 실수 정수 논리  
// 필드 오브젝트
// 스택 필드 모두 참조불가능하다면 메모리할당이 되지않음
	double pie = 3.14;
	int pieInt = (int)pie;
	System.out.println(pie);
	System.out.println(pieInt);
	
	int num =100;
	double doubleNum = num;
	System.out.println(doubleNum);
	System.out.println(num);
	float floatnum = (float)num;
	System.out.println(floatnum);
	
	int i = 10000;
	
}
}
