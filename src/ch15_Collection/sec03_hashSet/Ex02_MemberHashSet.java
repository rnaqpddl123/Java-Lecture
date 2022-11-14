package ch15_Collection.sec03_hashSet;

import java.util.HashSet;
import java.util.Set;

public class Ex02_MemberHashSet {

	public static void main(String[] args) {
		Member member1 = new Member("홍길동", 30);
		Member member2 = new Member("홍길동", 30);
		System.out.println(member1.hashCode() + ", " + member2.hashCode());		// hashcode가 다름
		System.out.println(member1.equals(member2));							// false
		
		Member2 member3 = new Member2("홍길동", 30);
		Member2 member4 = new Member2("홍길동", 30);
		System.out.println(member3.hashCode() + ", " + member4.hashCode());	
		System.out.println(member3.equals(member4));	//true
		
		// Member사용
		Set<Member> set = new HashSet<>();
		set.add(member1);
		set.add(member2); 	// Member2 처럼 재정의 하지않았기 때문에 member1과 member2가 다른거로 판단해서 set에 넣어줌
		set.add(new Member("홍길동", 31));
		set.add(new Member("홍자바", 28));

		//저장된 객체수
		System.out.println("Member을 사용한 set에 저장된 객체수 : " + set.size());
		
		
		
		// Member2를 사용
		Set<Member2> set2 = new HashSet<>();
		set2.add(member3);
		set2.add(member4); 	// 중복 객체(hashCode()와 equals()를 Overrid했기 때문에 동일 객체라고 판단, set2에 안넣어줌)
		set2.add(new Member2("홍길동", 31));
		set2.add(new Member2("홍자바", 28));
		
		//저장된 객체수
		System.out.println("Member2을 사용한 set2에 저장된 객체수 : " + set2.size());
		
		
		
		
		
		

	}

}
