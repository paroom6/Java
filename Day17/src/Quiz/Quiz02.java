package Quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 영문을 입력받아 엔터를 입력하면 입력한 영문을 소문자는
		 * 대문자로 대문자는 소문자로 변경하여 출력하는 프로그램을 작성
		 * 단 END, end 라는 문자열을 입력받으면 프로그램종료
		 * 
		 * 입력 >>
		 * asdaASDA
		 * 대소문자변환: ASDAasda
		 * 입력 >>
		 * end
		 * 프로그램 종료!!
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("입력 >> ");
			String str = sc.nextLine();
			String answer = "";
			if(str.equals("end")||str.equals("END")) {
				System.out.println("프로그램 종료!!");
				break;
			}
			//for(char a : str.toCharArray()) str 배열을 char 형 배열로 바꿔서 반환해준다.
			for(int i=0; i<str.length(); i++) {
				char c = str.charAt(i);
				if(Character.isUpperCase(c)) {
					answer+=Character.toLowerCase(c); 
				}else if(Character.isLowerCase(c)) {
					answer+=Character.toUpperCase(c); 
				}
			}
			System.out.println("대소문자변환 : "+answer);
		}
		sc.close();
	}

}
