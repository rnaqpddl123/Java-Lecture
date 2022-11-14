package ch15_Collection.sec03_hashSet;
/**
 * Member와 달리 hashCode와 equals를 재정의
 */
import java.util.Objects;

public class Member2 {
	private String name;
	private	int age;
	
	Member2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(name, age);
//		return name.hashCode() + age;	//책에서는 이렇게되어있음 둘다 사용가능
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Member2))	// obj와 Member의 객체 타입이 다르면 return false
			return false;
		Member2 target = (Member2) obj;
		return name.equals(target.name) && age == target.age;
		
		// 책에서의 내용 	// Java16부터 사용가능
//		if (obj instanceof Member2 target)
//			return name.equals(target.name) && age == target.age;
//		else 
//			return false;
		
			
 		
					
					
	}

}
