package ch15_Collection.sec06_treeSet;

public class Person implements Comparable {
	public String name;
	public int age;
	
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Person))
			return 0;
		Person p = (Person) o;
//		return age - p.age;		//	나이 기준 오름차순정렬
//		return p.age - age;		//	나이 기준 내림차순정렬
//		return name.compareTo(p.name); //이름 기준오름차순정렬
//		return p.name.compareTo(name); //이름 기준내림차순정렬
		//나이, 이름 오름차순(기본은 나이오름차순인데 나이가 같다면 이름을 기준으로 오름차순정렬)
		return (age == p.age) ? name.compareTo(p.name): age - p.age;	
	}

	
	
}
