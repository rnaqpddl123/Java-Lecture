package ch12_thread;

public class Ex02_MultiThreadRunnable {

	public static void main(String[] args) throws InterruptedException {
		Runnable beepTask = new Ex02_BeepTask();
		Thread thread = new Thread(beepTask);

		// 싱글 thread와 다르게 소리와 글자가 동시에 진행됨
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);

		}

	}

}
