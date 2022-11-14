package ch13_generic.sec05_restructed;

public class Util {
	// Number의 하위객체
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		System.out.println(t1.getClass().getName());
		System.out.println(t2.getClass().getName());

		return Double.compare(v1, v2); // v1이 크면1, v2가 크면-1, 같으면 0

	}

}
