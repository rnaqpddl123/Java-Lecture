package ch06;

public class Ex33_MemberService {
	
	private String id = "hong";
	private String password = "12345";
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPASSWARD() {
		return password;
	}
	
	
	boolean login(String id, String password) {	
		if (this.id == id && this.password==password) {
			return true;
		}
		return false;
	}
	void logout(String id) {
		if(this.id == id)
			System.out.println("로그아웃되었습니다.");
		else
			System.out.println("아이디가 일치하지않아 로그아웃되지 않았습니다.");
	}

}
