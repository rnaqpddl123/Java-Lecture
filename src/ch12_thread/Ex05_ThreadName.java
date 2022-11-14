package ch12_thread;

public class Ex05_ThreadName {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("Main 쓰레드 이름: " + mainThread.getName());

		Thread threadA = new Ex05_ThreadA(); // threadA 생성
		System.out.println("작업 쓰레드 이름: " + threadA.getName());
		threadA.start(); // threadA 실행

		Thread threadB = new Ex05_ThreadB(); // threadB 생성
		System.out.println("작업 쓰레드 이름: " + threadB.getName());
		threadB.start(); // threadB 실행

	}

}
