package ch11.sec11_arrays;

import java.util.Arrays;
/*
 * 별도의 Comparator를 구현한 객체를 이용
 */

public class Ex05_ObjectSort2 {

	public static void main(String[] args) {
		Ex05_Member member1 = new Ex05_Member(0, "박자바");
		Ex05_Member member2 = new Ex05_Member(1, "이자바");
		Ex05_Member member3 = new Ex05_Member(2, "김자바");
		Ex05_Member[] members = {member1, member2, member3};
		
		//오름차순
		Arrays.sort(members, new Ex05_MemberComparator());
		for(Ex05_Member member : members) {
			System.out.println(member);
		}

		System.out.println();
		
		//내림차순
		Arrays.sort(members, new Ex05_MemberReverseComparator());
		for(Ex05_Member member : members) {
			System.out.println(member);
		}
			
			
		
		

	}

}
