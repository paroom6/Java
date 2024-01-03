package Quiz;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 회원 클래스
		 * 회원아이디를 나타내는 id(문자열)
		 * 회원이름을 나타내는 name(문자열)
		 * 회원의 point를 나타내는 point(정수)
		 * 필드가 있다
		 * 각 메소드는 각 회원의 필드 값을 변화시키고 반환하는 get,set메소드를 가지고 있다
		 * 모든 필드는 외부의 직접 접근을 막기위해 private로 접근제한을 하고있다
		 * 실행결과
		 * 아이디:eeee
		 * 이름 : 본인이름
		 * 포인트: 20000
		 */

		Member mem = new Member("eeee","조성민",20000);

		System.out.println("아이디:"+mem.getId());
		System.out.println("이름 :"+mem.getName());
		System.out.println("포인트:"+mem.getPoint());

	}

}
