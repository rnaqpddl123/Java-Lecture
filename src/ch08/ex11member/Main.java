package ch08.ex11member;

/**
 * ch06의 EX41을 인터페이스를 사용하여 만들어보자
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 굉장히 많이 사용되는 방식
		// 변수명을 인터페이스이름으로(memberService) 인터페이스로 구현한 클래스를 대입함(Ex11_ArrayMemberService())
		MemberService memberService = new ArrayMemberService();
		memberService.register("hong", "12345", "홍길동");
		memberService.printAllMembers();
		memberService.register("kim", "9876", "김자바");
		memberService.printAllMembers();
		memberService.register("park", "1545", "박자바");
		memberService.printAllMembers();
		System.out.println();

		Scanner scan = new Scanner(System.in);
		System.out.print("아이디(id): ");
		String id = scan.nextLine();
		System.out.print("패스워드(password): ");
		String password = scan.nextLine();

		boolean result = memberService.login(id, password);
		if (result) {
			System.out.println("로그인되었습니다.");
			memberService.logout(id);
		} else
			System.out.println("id 또는 password가 올바르지 않습니다.");
		scan.close();

	}

}
