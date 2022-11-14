package ch11.sec07_string;
/*
 * 나만의 유용한 메소드 만들어놓기
 */

public class Strings {
	
	public static boolean isPalindrome(String src) {		// 우영우,기러기 같이 거꾸로 뒤집어도 같은 글자인지 확인
		
		return src.equals(reverse(src));
	}
	
	public static String reverse (String src) {
		String reverseStr = "";	
		int len = src.length();
		
		for (int i=0; i<len; i++) {
			reverseStr +=  src.charAt(len-i-1);
		}	
		return reverseStr;
	}
	
	public static int count(String src, String target) {
		String eliminated = src.replace(target, "");
		int len = (src.length()- eliminated.length())/ target.length();
		return len;
	}
	
	

}
