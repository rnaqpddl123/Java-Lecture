package ch11.sec11_arrays;

import java.util.Arrays;
/**
 * 비교하려는 Object Comparable 인터페이스를 구현한경우
 */

public class Ex04_ClassSort {

	public static void main(String[] args) {
		Ex04_Member member1 = new Ex04_Member(0, "박자바");
		Ex04_Member member2 = new Ex04_Member(1, "이자바");
		Ex04_Member member3 = new Ex04_Member(2, "김자바");
		Ex04_Member[] members = {member1, member2, member3};
		
		
		// Ex04_Member에서 정의한대로 name을 기준으로 오름차순정렬
		Arrays.sort(members);
		for(Ex04_Member member : members) {
			System.out.println(member);
		}
	}

}
