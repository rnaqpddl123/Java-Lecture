package ch11.sec07_string;

public class Q02_Reverse {

	public static void main(String[] args) {
		String s1 = "안녕하세요?";
		String s2 = "Hello world";
		String s3 = "기러기";
			
		System.out.println(Strings.reverse(s1));
		System.out.println(Strings.reverse(s2));
		
		System.out.println(Strings.isPalindrome(s1));
		System.out.println(Strings.isPalindrome(s3));
		
		System.out.println(Strings.count("123456789","9"));

	}
	

}
