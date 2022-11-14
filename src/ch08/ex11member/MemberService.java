package ch08.ex11member;
/**
 * ch06의 EX41_MembershipService를 인터페이스를 사용하여 만들어보자
 */
public interface MemberService {
	void register(String id, String password, String name);
	void printAllMembers();
	Member findById(String id);
	boolean login(String id, String password);
	void logout(String id);
}
