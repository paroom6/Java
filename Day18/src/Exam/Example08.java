package Exam;

import java.io.FileReader;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		try {
			fin = new FileReader("C:/upload/텍스트.txt");
			int c;
			/*
			 * 파일 끝까지 한 바이트씩 c에 읽어드림
			 * 파일의 끝을 만나면  read()는 -1을 리턴
			 */
			while((c=fin.read())!=-1) {
				// 바이트 c 를 문자로 변환 출력
				System.out.print((char)c);
			}
			fin.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
