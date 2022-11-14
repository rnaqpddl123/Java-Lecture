package ch10.ex11MemberLogin;
/**
 * 내가 바꿔본것 (강사님은 인터페이스에 login()을boolean을 그대로 유지하였고 나는 타입을바꿔서함)
 * 
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
		
		// login
		try {
			memberService.login(id, password);
		} catch(NotExistIdException | WrongPasswordException e){
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} finally {
			System.out.println("감사합니다.");
		}
		

	
	}


}
