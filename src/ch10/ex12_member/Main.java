package ch10.ex12_member;
/**
 * 강사님 버전
 * ch08.ex11member의 login을 바꿔서 처리한것
 * cxh10.ex11은 내가한것 ex12는 강사님이한것
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 굉장히 많이 사용되는 방식
		// 변수명을 인터페이스이름으로(memberService) 인터페이스로 구현한 클래스를 대입함(Ex11_ArrayMemberService())
		MemberService memberService = new ArrayMemberService();
		memberService.register("hong", "12345", "홍길동");
		memberService.register("kim", "9876", "김자바");
		memberService.register("park", "1545", "박자바");
		memberService.printAllMembers();
		System.out.println();

		Scanner scan = new Scanner(System.in);
		System.out.print("아이디(id): ");
		String id = scan.nextLine();
		System.out.print("패스워드(password): ");
		String password = scan.nextLine();
		scan.close();

		
		try {
			boolean result = memberService.login(id, password);
			if (result) {
				System.out.println("로그인되었습니다.");
				memberService.logout(id);
			}
//		} catch (NotExistIdException | WrongPasswordException e) {	//RuntimeException은 저두개의 부모라서 아래와같이 써도됨
		} catch (RuntimeException e) {	
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
