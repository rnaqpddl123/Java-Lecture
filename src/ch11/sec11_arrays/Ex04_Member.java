package ch11.sec11_arrays;

// Comparable<클래스이름>을 넣으면  아래 Override에도 Object가 아니라 클래스 이름이나옴
public class Ex04_Member implements Comparable<Ex04_Member> {		

	int id;
	String name;

	Ex04_Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Ex04_Member o) {
		
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Ex04_Member [id=" + id + ", name=" + name + "]";
	}
	


}
