package mysql.erd.bbs;

import java.util.List;
import java.util.Scanner;

import org.mindrot.jbcrypt.BCrypt;

public class UsersTest {
	public static UsersDao dao = new UsersDao();

	public static void main(String[] args) {
		
		
		dao.registerUser(new Users("admin", "admin", "관리자", "admin@mysql.com"));
		dao.registerUser(new Users("james", "james", "제임스", "james@mysql.com"));
		
//		List<Users> list = dao.listUsers();
//		for (Users u :list)
//			System.out.println(u);
//		Users user = dao.getUserinfo("admin");
//		System.out.println(user);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("uid> ");
//		String uid = scan.nextLine();
//		System.out.println("pwd> ");
//		String pwd = scan.nextLine();
//		login(uid, pwd);
		

		}
	
	static void login (String uid, String pwd) {
		Users user = dao.getUserinfo(uid);
		if (!uid.equals(user.getUid()))
			System.out.println("ID가 없습니다.");
		else {
			if (BCrypt.checkpw(pwd, user.getPwd()))
				System.out.println("Login 성공");
			else
				System.out.println("패스워드가 틀립니다.");
			
		}
	}
	

}
