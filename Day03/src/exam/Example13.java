
package exam;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*복합 대입 연산자
		 * 변수y 사칙연산= 변수x
		 * y = x사칙연산y;
		 * */
		int x = 10;
		int y = 1;
		y +=x;//y=y+x
		System.out.println(y);
		y*=x;//y=y*x
		System.out.println(y);
		y%=x;//y=y%x
		System.out.println(y);
	}

}
