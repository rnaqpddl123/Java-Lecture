package ch03;
/**
 * 단항연산자	
 */
public class Ex02_Unary {

	public static void main(String[] args) {
		boolean a = true;
		System.out.println(!a);	//logical not
		
		int b = 3;
		System.out.println(Integer.toBinaryString(b));	// binary로 바꿔줌
		System.out.println(Integer.toBinaryString(~b));	// bitwise 반전
		System.out.println(Integer.toBinaryString(-b));	// 11의 2의 보수 
		System.out.println(Integer.toHexString(-b));	// 16진수표현
		

	}

}
