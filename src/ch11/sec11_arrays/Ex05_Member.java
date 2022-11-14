package ch11.sec11_arrays;
/*
 * Ex04_Member와 달리 compareTo 메소드를 만들지않음
 */

public class Ex05_Member {
	int id;
	String name;
	
	
	Ex05_Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Ex05_Member [id=" + id + ", name=" + name + "]";
	}
	

}
