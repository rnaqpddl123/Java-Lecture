package ch11.sec07_string;

public class Ex05_Replace {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어이고, 자바는 풍부한 API를 지원합니다.";
		// "자바"라는 글자를 "JAVA"로 바꿔줌
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
