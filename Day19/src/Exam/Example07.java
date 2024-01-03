package Exam;

import java.awt.Toolkit;


public class Example07 {

	public static void main(String[] args) {
		/*
		 * 메인 스레드(싱글스레드)만 이용할 경우Cannot instantiate the type Toolkit
		 * 한가지 작업이 끝나야 다음 작업을 처리한다.
		 * 
		 */
	  Toolkit toolkit = Toolkit.getDefaultToolkit();
	  for(int i = 0 ; i < 5; i++) {
		  toolkit.beep();
		  try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	  }
	  for(int i = 0; i < 5; i++) {
		  System.out.println("띵");
		  try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	  }
	}

}
