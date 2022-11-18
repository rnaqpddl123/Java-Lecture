package mysql.player;

import java.util.List;
import java.util.Scanner;


public class PlayerApp {
	private static Scanner scan = new Scanner(System.in);
	private static DAO dao = new DAO();
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.선수목록 || 2.선수등록 || 3.정보수정 || 4.선수정보삭제 || 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			switch(selectNo) {
			case 1:
				listPlayer(); break;
			case 2:
				registerPlayer(); break;
			case 3:
				updatePlayer(); break;
			case 4:
				deletePlayer(); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}
	
	public static void listPlayer() {
		List<DTO> list = dao.getPlayer();
		for (DTO c : list)
			System.out.println(c);
	}
	public static void registerPlayer() {
		int backnum = 0;
		String name = null;
		String position = null;
		String birthday = null;
		int height = 0;
		while(true) {
			System.out.print("backnum을 입력하세요> ");
			String num = scan.nextLine();
			if (num.length() ==0) {
				System.out.println("백넘버를 입력해주세요");
				continue;
			} 
			backnum = Integer.parseInt(num);
			DTO dto = dao.getPlayer(backnum);
			if (dto.getBacknum() == 0)
				break;
			System.out.println("중복된 backnum입니다. 다시 입력하세요");
		}
		System.out.print("이름을 입력하세요> ");
		while(true) {
			name = scan.nextLine();
			if (name.length() != 0)
				break;
			System.out.print("이름을 입력하세요>");
		}	
		System.out.print("포지션을 입력하세요> ");
		while(true) {
			position = scan.nextLine();
			if (position.length() != 0)
				break;
			System.out.print("포지션을 입력하세요>");
			
		}	
		System.out.print("생일을 입력하세요 (예시 2022-11-18)> ");
		while(true) {
			birthday = scan.nextLine();
			if (birthday.length() != 0)
				break;
			System.out.print("생일을 입력하세요 (예시 2022-11-18)> ");
			
		}	
		System.out.print("키를 입력하세요> ");	
		while(true) {
			String h = scan.nextLine();
			if (h.length() != 0) {
				height = Integer.parseInt(h);
				break;
			}
			System.out.print("키를 입력하세요> ");	
		}	
		DTO dto = new DTO(backnum, name, position, birthday, height);
		dao.insertPlayer(dto);	
	}
	public static void updatePlayer() {
		DTO dto = new DTO();
		int backnum = 0;
		while(true) {
			System.out.print("정보 수정을 원하는 선수의 backnum을 입력하세요> ");
			String num = scan.nextLine();
			if (num.length() ==0) {
				System.out.println("백넘버를 입력해주세요");
				continue;
			}
			backnum = Integer.parseInt(num);
			dto = dao.getPlayer(backnum);
			
			if (dto.getBacknum() != 0)
				break;
			System.out.println(backnum + "번의 backnum을 가진 선수는 없습니다. 다시입력해주세요");
		}
		
		System.out.print("현재 선수 이름(" + dto.getName() +")에서 변경할 선수이름을 입력해주세요> ");
		String name = scan.nextLine();
		name = (name.length() ==0) ? dto.getName() : name; 
		System.out.print("현재 포지션(" + dto.getposition() +")에서 변경할 포지션을 입력해주세요> ");
		String position = scan.nextLine();
		position = (position.length() ==0) ? dto.getposition().toString() : position; 
		System.out.print("현재 선수 생일(" + dto.getBirthday() +")에서 변경할 선수생일을 입력해주세요> ");
		String birthday = scan.nextLine();
		birthday = (birthday.length() ==0) ? dto.getBirthday().toString() : birthday; 
		System.out.print("현재 선수 키(" + dto.getHeight() +")에서 변경할 선수키를 입력해주세요> ");
		String h = scan.nextLine();
		int height = (h.length() == 0) ? dto.getHeight() : Integer.parseInt(h); 
		dto = new DTO(backnum, name, position, birthday, height);
		dao.updatePlayer(dto);
		System.out.println("선수 정보가 바뀌었습니다.");
		System.out.println(dto);
		
	}
	public static void deletePlayer() {
		System.out.print("삭제하고싶은 선수의 backnum을 입력해 주세요> ");
		int backnum = Integer.parseInt(scan.nextLine());
		dao.deletePlayer(backnum);
		System.out.println(backnum + "번 선수의 정보가 삭제되었습니다.");
	}

}
