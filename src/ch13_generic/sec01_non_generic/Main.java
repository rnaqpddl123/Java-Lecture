package ch13_generic.sec01_non_generic;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); // 자동 타입변환, "홍길동"이 String인데 String -> Object로 바뀜

		String name = (String) box.get(); // 강제 타입변환(casting) Object --> String

		// 8번째 줄이 일어나는 방식(풀어쓴것)
		// 위에처럼 쓰면 언제든지 error이 일어날수있다.
		// 아래처럼 instanceof String을 해줘야 안심이일어남
//		String name = null;
//		if (box.get() instanceof String)
//			name = (String) box.get(); // 강제 타입변환(casting) Object --> String

		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}

}
