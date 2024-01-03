package Exam;

class Member{
	private int memberId;
	private String memberName;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
}
public class Example11 {
	public static void main(String[] args) {
		Member mem = new Member(23,"조성민");
		System.out.println(mem.toString());
		
	}

}
