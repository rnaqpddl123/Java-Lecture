package ch10;

/*
 *  thorws - main method에서 얌체같이 예외를 떠넘길수있음
 */

public class Ex10_Throws2 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("111");
		Class clazz = Class.forName("jaba.lang.String2");
		System.out.println("222");
	}

}
