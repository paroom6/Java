package Exam;
class Thread1 extends Thread {
	public Thread1() {
		setName("Thread park");
	}
	public void run() {
		for(int i = 0; i < 5; i++ ) {
			try {
				Thread.sleep(3000);
				System.out.println("Thread1: " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Thread2 extends Thread {
	public Thread2() {
		setName("Thread jo");
	}
	public void run() {
		for(int i = 0; i < 5; i++ ) {
			try {
				Thread.sleep(2000);
				System.out.println("Thread2: " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}
}
public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 스레드의 이름
		 * 스레드는 이름을 가지고 있으며 디버깅 할 때 어떤 스레드가 
		 * 무슨 작업을 하는지 검사할 때 가끔 쓰인다.
		 */
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드" + mainThread.getName());
		
		Thread1 thread1 = new Thread1();
		System.out.println("작업 스레드 : " + thread1.getName());
		thread1.start();
		
		Thread2 thread2 = new Thread2();
		System.out.println("작업 스레드 : " + thread2.getName());
		thread2.start();
	}

}
