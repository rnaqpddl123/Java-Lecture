package ch18_io.object;

import java.io.Serializable;

public class Member implements Serializable{
	/**
	 * 직렬화 : 한줄로 쭉 가는것
	 * serialVersionUID 값은 프로그램 작성자가 버전관리를 해줘야한다.
	 */
//	private static final long serialVersionUID = 1L;		//하나만 쓸꺼면 이렇게해도 무방한데 여러개 쓰면 문제가 생김
	private static final long serialVersionUID = -5163362939828600956L;		// 여러개의 클래스를 사용하기 때문에 이렇게 사용하는걸 추천
	private String id;
	private String name;
	Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	

}
