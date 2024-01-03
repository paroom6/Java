package Quiz;

class MyFriendInfo{
	String name;
	int age;
	
	public MyFriendInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showMyFriendInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}


class MyFriendDetailInfo extends MyFriendInfo {
	String addr;
	String tel;
	
	public MyFriendDetailInfo(String name, int age,String addr, String tel) {
		super(name, age);
		this.addr = addr;
		this.tel = tel;
		// TODO Auto-generated constructor stub
	}
	
	public void Info() {
		showMyFriendInfo();
		System.out.println("주소 : "+addr);
		System.out.println("전화번호 : "+tel);
	}

}

public class FriendInfo {
	public static void main(String[] args) {
		/*
		 * 친구 정보를 기록할 MyFriendInfo 클래스를
		 * 상세정보를 기록할 MyFriendDetailInfo 클래스에 
		 * 상속하고 이름 나이는 MyFriendInfo 클래스에 
		 * 주소와 번호는 MyFriendDetailInfo 에 입력할 수 
		 * 있도록 구성하세요
		 * 
		 * 이름 : 홍길동
		 * 나이 : 150
		 * 주소 : 서울시 서초구 
		 * 전화번호 : 010-4444-4444
		 */
		MyFriendDetailInfo friend = new MyFriendDetailInfo("홍길동", 150, "서울시 서초구", "010-4444-4444");
		friend.Info();
		}

}
