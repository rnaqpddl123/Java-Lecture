package ch10.ex11MemberLogin;

public interface MemberService {
	void register(String id, String password, String name);
	void printAllMembers();
	Member findById(String id);
	void login(String id, String password);
	void logout(String id);
}
