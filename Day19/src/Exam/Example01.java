package Exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 문자집합과 InputStreamReader를 이용해 텍스트 파일 읽기
		 * InputStreamReader는 스트림에 입력되는 바이트 데이터를 
		 * 문자 집을 통해 문자로 변환함
		 * -InputStreamReader의 생성자에 문자집합을 지정해야한다.
		 * 만약 읽어들인 바이트들이 문자집합에 속하지 않는 경우 
		 * 해독할 수 없는 글자가 출력된다.
		 */
		FileInputStream fin = new FileInputStream("c:\\upload\\텍스트.txt");
		InputStreamReader in = new InputStreamReader(fin,"UTF-8"); 
		int c;
		while((c = in.read()) != -1) {
			System.out.print((char) c);
		}
		in.close();
	}

}
