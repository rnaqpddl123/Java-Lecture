package ch15_Collection.Exercise;

import java.util.HashSet;
import java.util.Set;

public class Q08_HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		System.out.println("저장된 객체수" + set.size());
		set.forEach(s -> System.out.println(s));
//		for (Student s : set)
//			System.out.println(s.studentNum + ":" + s.name);

	}

}
