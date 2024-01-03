package Exam;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Phone[] phone = null;
		
		while(true) {
			System.out.println("1.입력 | 2.검색 | 3.프로그램 종료");
			System.out.println("메뉴를 선택해 주세요 >>");
			int choice = sc.nextInt();
			if(choice ==1) {
				System.out.println("인원수 >> ");
				int count = sc.nextInt();
				phone = new Phone[count];
				for(int i=0; i<count; i++) {
					System.out.println("이름과 전화번호를 입력하세요 >>");
					String name = sc.next();
					String tel = sc.next();
					phone[i]= new Phone(name,tel);
					
				}
			}else if(choice == 2) {
				System.out.println("검색할 이름 >>");
				String search_name= sc.next();
				boolean found = false;
				for(int i=0; i<phone.length; i++) {
					if(phone[i].getName().equals(search_name)) {
						System.out.println(search_name+"의 번호는 "+phone[i].getTel()+"입니다.");
						found = true;
						break;
					}
				}
				if(!found) {
					System.out.println(search_name+"의 이름은 없습니다.");
				}
			}else if(choice == 3) {
				System.out.println("프로그램 종료!!~~");
				System.exit(0);
			}
		}

		
	}

}
