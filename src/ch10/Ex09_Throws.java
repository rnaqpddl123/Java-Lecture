package ch10;

/** 
 * throws - 예외를 호출한 곳으로 떠넘기기
 */

public class Ex09_Throws {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("jaba.lang.String2");
	}

}
