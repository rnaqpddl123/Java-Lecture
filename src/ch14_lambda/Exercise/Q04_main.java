package ch14_lambda.Exercise;
/**
 * 이것이 자바다 715p 4번문제 
 */

public class Q04_main {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i=0; i<3; i++)
				System.out.println("작업 스레드가 실행됩니다.");
		});
		thread.start();

	}

}
