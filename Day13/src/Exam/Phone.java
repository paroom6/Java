package Exam;

public class Phone {
	/*
	 * 이름과 전화번호를 받음
	 * 
	 */
	private String name;
	private String tel;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Phone(String name, String tel) {
		this.name=name;
		this.tel= tel;
	}
}
