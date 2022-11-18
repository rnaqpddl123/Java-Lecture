package mysql.customer;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustometApp {
	private static Scanner scan = new Scanner(System.in);
	private static DAO dao = new DAO();

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.고객목록 || 2.고객등록 || 3.정보수정 || 4.고객탈퇴 || 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			switch(selectNo) {
			case 1:
				listCustomer(); break;
			case 2:
				registerCustomer(); break;
			case 3:
				updateCustomer(); break;
			case 4:
				deleteCustomer(); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}
	
	public static void listCustomer() {
		List<Customer> list = dao.getCustomers();
		for (Customer c : list)
			System.out.println(c);	
	}

	public static void registerCustomer() {
		String uid = null;
		while(true) {
			System.out.print("UID를 입력하세요> ");
			uid = scan.nextLine();
			Customer c = dao.getCustomer(uid);
			if (c.getUid() == null)	//uid가 중복이 아닐경우
				break;
			System.out.println("중복된 UID입니다. 다시입력하세요");
			}	
		System.out.print("이름을 입력하세요> ");
		String name = scan.nextLine();
		Customer nc = new Customer(uid,name);
		dao.insertCustomer(nc);
		
	}
	public static void updateCustomer(){
		System.out.print("UID를 입력하세요> ");
		String uid = scan.nextLine();
		Customer c = dao.getCustomer(uid);
		System.out.print("고객명(" + c.getName() + ")> ");
		String name = scan.nextLine();
		System.out.println();
		System.out.print("등록일(" + c.getRegdate().toString() + ")> ");
		String regDate = scan.nextLine();
		c = new Customer(uid, name, LocalDate.parse(regDate), 0);
		dao.updateCustomer(c);
		System.out.println("고객님 이름이 변경되었습니다");
		System.out.println(c);
	}
	public static void deleteCustomer() {
		System.out.print("삭제하고싶은 UID를 입력해 주세요> ");
		String uid = scan.nextLine();
		dao.deleteCustomer(uid);
		System.out.println("고객 탈퇴를 마쳤습니다.");
		
	}

}
