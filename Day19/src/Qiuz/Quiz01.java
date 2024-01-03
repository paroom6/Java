package Qiuz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * Scanner로 입력받은 이름과 전화번호를 한줄에 한사람씩
		 * 경로에 저장 "그만"을 입력하면 프로그램 종료
		 * 
		 * 실행)
		 * 전화번호 입력프로그램입니다
		 * 이름 전화번호 >> 조성민 010-3405-3728 
		 * 이름 전화번호 >> 조성민 010-3405-3728 
		 * 이름 전화번호 >> 조성민 010-3405-3728 
		 * 이름 전화번호 >> 조성민 010-3405-3728 
		 * 이름 전화번호 >> 그만
		 * c://"에 저장하였습니다"
		 */
		Scanner sc = new Scanner(System.in);
		File file = new File("c:/upload/전화번호.txt");
		FileWriter fout = null;
		try {
			fout = new FileWriter("c:/upload/전화번호.txt");
			while(true) {
				String line = sc.nextLine();
				if("그만".equals(line)) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n",0,2);//줄바꿈
			}
			fout.close();//닫지않으면 입력이 안됨!!!
			System.out.println(file.getAbsolutePath() + "에 저장하였습니다.");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		sc.close();
	}
}
