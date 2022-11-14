package ch10.ex12_member;

public class ArrayMemberService implements MemberService {
	private Member[] members = new Member[10]; // array크기를 10으로 할당

	@Override
	public void register(String id, String password, String name) {
		Member member = findById(id);
		if (member != null) { // 동일한 id가 이미 존재함
			System.out.println("id가 중복되었습니다.");
			return;
		}

		member = new Member(id, password, name);
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				members[i] = member;
				break;
			}
		}
	}

	@Override
	public void printAllMembers() {
		for (Member member : members) {
			if (member == null)
				break;
			System.out.println(member);
		}
	}

	@Override
	public Member findById(String id) {
		for (Member member : members) {
			if (member == null) // id에 해당하는 member를 못찾고 끝까지 간경우
				break;
			if (id.equals(member.getId())) // id에 해당하는 member를 찾은경우
				return member;
		}
		return null;
	}

	@Override
//	public boolean login(String id, String password) throws WrongPasswordException, NotExistIdException{
	public boolean login(String id, String password) throws RuntimeException{
		Member member = findById(id);
		if (member == null)
			throw new NotExistIdException(id + "은/는 없는 아이디 입니다.");// id에 해당하는 member가 없는 경우
//			return false;
		else { 					// id에 해당하는 member를 찾은경우
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName() + "님 환영합니다.");
				return true;
			} else // 패스워드가 틀린경우
				throw new WrongPasswordException("패스워드가 틀렸습니다.");
//				return false;
		}
	}		// return false;를 넣을수도없고 넣지않아도 되는 이유는 boolean의 초기값은 false기때문에
			// login성공했을때만 true를 줘도 login을 실패했을때의 

	@Override
	public void logout(String id) {
		Member member = findById(id);
		System.out.println(member.getName() + "님 로그아웃 되셧습니다.");
	}

}
