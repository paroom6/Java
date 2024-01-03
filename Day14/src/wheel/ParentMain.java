package wheel;

class Parent{}
class Child extends Parent{	}

public class ParentMain {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		// 자식 ->부모객체로 자동타입 변환
		Parent p3 = new Child();
		
		Parent p4 = c1;
		//Child c2 = p1;
		if(p4==c1) {//형변환 되었음
			System.out.println("p4와 c1은 같은 객체를 참조하고 있다.");
		}
	}
}
