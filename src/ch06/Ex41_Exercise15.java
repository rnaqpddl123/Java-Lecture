package ch06;

import java.util.Scanner;

public class Ex41_Exercise15 {
	
	public static void main(String[] args) {
		Ex41_MemberService memberService = new Ex41_MemberService();
		memberService.register("hong", "12345", "홍길동");
		memberService.printAllMembers();	
		memberService.register("kim", "9876", "김자바");
		memberService.printAllMembers();	
		memberService.register("kim", "1545", "홍자바");
		memberService.printAllMembers();	
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디(id): ");
		String id = scan.nextLine();
		System.out.print("패스워드(password): ");
		String password = scan.nextLine();
		scan.close();
		
		boolean result = memberService.login(id, password);
		if (result) {
			System.out.println("로그인되었습니다.");
			memberService.logout(id);
		}
		else
			System.out.println("id 또는 password가 올바르지 않습니다.");
		
	}
	
}
