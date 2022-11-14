package ch12_thread.Exercise;
/*
 * p633 확인문제2
 */

public class Q02_Main {

	public static void main(String[] args) {

		// MovieThread에서 이미 Thread를 이미 extends 했기때문에 생략가능
		Thread thread1 = new MovieThread();
		thread1.start();

		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();

	}

}
