package ch12_thread;

import java.awt.Toolkit;

public class Ex02_BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);// 1000 ms(1초)만큼 중지
			} catch (InterruptedException e) {
			}
		}

	}

}
