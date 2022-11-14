package ch11.sec07_string;
/*
 * 이것이자바다 11장9절내용
 */

public class Ex21_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");						// Java
		// StringBuilder를 찍고싶으면 타입변환 필요
		System.out.println(sb.toString());		
		sb.append("Program Study");				// Java Program Study
		System.out.println(sb.toString());
		
		// 4번째에 2를 중간에 넣어줌
		sb.insert(4, 2);						// Java2 Program Study
		System.out.println(sb.toString());
		
		// 4번째에 글자를 6으로 교체 ""말고 ''씀
		sb.setCharAt(4, '6');					// Java6 Program Study
		System.out.println(sb.toString());
		
		// 6번째부터 13번째를 "Book"으로 교체	(6은 포함 13미포함)
		sb.replace(6,13,"Book");				// Java6 Book Study
		System.out.println(sb.toString());
		
		//4번째부터 5번째까지삭제	(4는포함 5는미포함)
		sb.delete(4, 5);						// Java Book Study
		System.out.println(sb.toString());
		
		// 글자열 뒤집기
		System.out.println(sb.reverse().toString());

		

	}

}
