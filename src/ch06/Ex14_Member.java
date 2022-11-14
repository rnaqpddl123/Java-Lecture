package ch06;

public class Ex14_Member {
	// private라고 선언하면 class안에서만 사용가능
	// 보통 private으로 선언하고 public은 아래에 getxxxx, setxxxxx로 만듬
	// 이 클래스를 벗어나면 사용불가(main에서는 사용 불가능하다는얘기)
	private String uid;
	private String name;
	private String passward;
	private int age;
	
	public Ex14_Member() {}
	public Ex14_Member(String uid, String name, String passward, int age) {
		super();
		this.uid = uid;
		this.name = name;
		this.passward = passward;
		this.age = age;
	}
	
	// 상단에 Source -> Generated Getters and Setters..로 만듬
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Ex14_Member [uid=" + uid + ", name=" + name + ", passward=" + passward + ", age=" + age + "]";
	}
	
	
	
	
}
