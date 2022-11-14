package ch13_generic.Exercise;
/*
 * 이것이 자바다 p587 확인문제 3번
 */

public class Q03_main {

	public static void main(String[] args) {
		Q03_Container<String, String> container1 = new Q03_Container<>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println("이름: " + name1 + "  직업: " + job);

		Q03_Container<String, Integer> container2 = new Q03_Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		Integer age = container2.getValue();
		System.out.println("이름: " + name2 + "  나이: " + age);

	}

}
