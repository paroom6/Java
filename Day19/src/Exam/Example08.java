package Exam;

import java.awt.Toolkit;
class BeepoTask implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0 ; i < 5; i++) {
				toolkit.beep();
					try {
						System.out.println(i);
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
						// TODO: handle exception
					}
			}
	}
}

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable beepTask = new BeepoTask();
		beepTask.run();
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
