package ch13_generic.Exercise;

public class Q04_main {

	public static void main(String[] args) {
		Q04_Pair<String, Integer> pair = new Q04_Pair<>("홍길동", 35);
		Integer age = Q04_Util.getValue(pair, "홍길동");
		System.out.println(age);

		Q04_ChildPair<String, Integer> childPair = new Q04_ChildPair<>("임꺽정", 20);
		Integer childage = Q04_Util.getValue(childPair, "홍삼순");
		System.out.println(childage);

		// Q04_OtherPair은 Q04_Pair을 상속 하지 않으므로 컴파일 에러가 발생
//		Q04_OtherPair<String, Integer> otherPair = new Q04_OtherPair<>("홍삼원", 20);
//		Integer otherAge = Q04_Util.getValue(otherPair, "홍삼순");
//		System.out.println(childage);

	}

}
