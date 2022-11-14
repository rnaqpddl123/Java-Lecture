package ch13_generic.Exercise;

public class Q04_Util {
	// 다형성을 이용하는 방법
//	public static <K, V> V getValue(Q04_Pair<K, V> pair, K k) {
//		if (pair.getKey().equals(k)) {
//			return pair.getvalue();
//		} else {
//			return null;
//		}
//
//	}

	// 위랑 아래랑 같음 - 다형성을 이용하냐 Restricted이용하냐의 차이
	// Restricted 이용
	// ----------------------상위타입--------------리턴타입-메소드(매개변수){
	public static <P extends Q04_Pair<K, V>, K, V> V getValue(P p, K k) {
		if (p.getKey().equals(k)) {
			return p.getvalue();
		} else {
			return null;
		}

	}

}
