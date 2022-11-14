package ch15_Collection.sec03_hashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet 기본 사용법
 * set은 중복허용X 
 * index값도 존재하지않음 (특정객체를 찾으려면 객체의 이름을 알아야한다)
 */

public class Ex01_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		//객체 저장
		set.add("Java");
		set.add("JSP");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java");		// 중복 객체이므로 저장되지 않음
		
		// 저장된 객체 수
		System.out.println("저장된 객체 수: " + set.size());
		System.out.println();
		
		//전체 출력
		for (String str : set)
			System.out.println(str);
		System.out.println();
		//전체 출력(람다식 이용)
		set.forEach(s -> System.out.println(s));
		
		//객체 삭제
		set.remove("JSP");
		System.out.println("저장된 객체 수: " + set.size());
		System.out.println();
		
		// 특정 조건 객체삭제 (글자수 6글자이상 삭제)
		set.removeIf(s -> s.length() > 6);
		set.forEach(s -> System.out.println(s));
		
		
		

	}

}
