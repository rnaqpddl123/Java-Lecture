package ch13_generic.sec02_generic;
/*
 * generic 기본
 * sec01 non_generic과 비교하면서 보면 편할것같다.
 */

public class Main {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("홍길동");
		String name = box1.get();

		Box<Apple> box2 = new Box<>(); // new Box<Apple>();와 같은 코드. <>안이 앞과 같다면 생략가능
		box2.set(new Apple());
		Apple apple = box2.get();

	}

}
