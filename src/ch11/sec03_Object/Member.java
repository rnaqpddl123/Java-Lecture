package ch11.sec03_Object;

public class Member {
	String id;
	String name;
	
	Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {	// 같은 타입인지 확인
			Member member = (Member) obj;	// obj로 받은걸 member로 바꿈	
//			if (id.equals(member.id) && name.equals(member.name)) {	//id, name이 모두 같다면
//			if (id.equals(member.id)) {  							//id만 같다면
			if (id == member.id) {	
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	

}
