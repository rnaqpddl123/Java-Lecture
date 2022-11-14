package ch15_Collection.sec06_treeSet;
/**
 * treeSet에 한번에 여러개의 데이터를 넣을때
 * 어떻게 정렬해야하는지 안정해주면 Exception이 발생한다.
 */

import java.util.TreeSet;

public class Ex02_PersonComparable {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		//객체 저장
		treeSet.add(new Person("홍길동", 25));
		treeSet.add(new Person("김자바", 45));
		treeSet.add(new Person("박자바", 32));
		treeSet.add(new Person("이자바", 45));
		
		
		for (Person p : treeSet)
			System.out.println(p.name +" "+ p.age);
		
		

	}

}
