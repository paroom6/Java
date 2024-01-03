package Exam;

import java.io.File;

public class Example03 {

	public static void main(String[] args) {
		/*
		 * File 클래스
		 * File 클래스는 입출력에 필요한 파일 및 디렉토리에 관한
		 * 정보를 다룰 수 있다.
		 * File 클래스 새로운 파일과 디렉토리 생성 및 삭제,
		 * 이름 변경등의 조작 메소드를 가지고 있다.
		 */
		File file = new File("c:\\upload\\test.txt");
		if(file.exists()) {
			try {
				//파일 이름 표시
				System.out.println("getName : " + file.getName());
				
				//파일 경로 표시
				System.out.println("getPath : " + file.getPath());
				
				//상위 디렉토리 표시
				System.out.println("getParent : " + file.getParent());
				
				if(file.canRead()) {//파일 쓰기권한 체크
					System.out.println(file.getName() + " 쓰기가능");
					
				}
				if(file.isFile()) {
					System.out.println(file.getName() + " is file");

				}
				if (file.isDirectory()) {
					System.out.println(file.getName() + " is directory");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
