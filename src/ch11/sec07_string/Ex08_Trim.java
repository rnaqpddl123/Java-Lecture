package ch11.sec07_string;

public class Ex08_Trim {

	public static void main(String[] args) {
		String oldStr = "   자바 프로그래밍   \t \r \n";
		// 앞뒤 공백 없애줌
		String newStr = oldStr.trim();
		
		System.out.println(newStr);
		System.out.println(oldStr.length());
		System.out.println(newStr.length());
		

	}

}
