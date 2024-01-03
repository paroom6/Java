package Exam;

import java.io.FileWriter;
import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		/*
		 * 파일쓰기 
		 * FileWriter
		 */
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:/upload/test.txt");
			while(true) {
			String line = sc.nextLine();
			if(line.length()==0) {
				break;
			}
			fout.write(line, 0, line.length());
			fout.write("\r\n",0,2);//줄바꿈
			}
			fout.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		sc.close();
	}
}