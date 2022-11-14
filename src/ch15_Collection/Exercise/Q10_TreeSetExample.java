package ch15_Collection.Exercise;

import java.util.TreeSet;

public class Q10_TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Q10_Student> treeSet = new TreeSet<>();
		treeSet.add(new Q10_Student("blue", 96));
		treeSet.add(new Q10_Student("hong", 86));
		treeSet.add(new Q10_Student("white", 92));
		treeSet.add(new Q10_Student("white", 93));
		
		Q10_Student student = treeSet.last();
		System.out.println("최고점수: " + student.score);
		System.out.println("최고점수를 받은 아이디: " + student.id);
		
		for (Q10_Student s : treeSet)
			System.out.println(s.id + " 점수: " + s.score);
		
		
	}

}
