package ch11.sec07_string;
/*
 * 팔린드롬 (23532 뒤집어도 같은결과나오는거)
 * 3자리 정수 두개를 곱해서 나온값 (100*100 = 10000)
 * 이 팔린드롬이라고할때 가장큰 팔린드롬수는?
 */

public class Q01_Palindrome_MyVersion {

	public static void main(String[] args) {
		int max = 0, num1 = 0, num2 = 0;
		int mul;
		String numString;

		for (int i = 100; i < 1000; i++) {
			for (int k = 100; k < 1000; k++) {
				mul = i * k;
				numString = Integer.toString(mul);
				if (numString.equals(reverse(numString))) {
					if (max < mul) {
						max = mul;
						num1 = i;
						num2 = k;
					}
				}
			}
		}
		
		System.out.println(num1 + " x " + num2 + " = " + reverse(Integer.toString(max)));
	}

	static String reverse(String src) {
		String reverseStr = "";
		int len = src.length();

		for (int i = 0; i < len; i++) {
			reverseStr += src.charAt(len - i - 1);
		}
		return reverseStr;
	}

}