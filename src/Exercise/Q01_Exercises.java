package Exercise;

import java.util.HashSet;

public class Q01_Exercises {

	public static void main(String[] args) {
		// Student를 저장하는 Hashset저장
		HashSet<Student> hashSet = new HashSet<Student>();

		// Student저장
		hashSet.add(new Student("1001200"));
		hashSet.add(new Student("1001200")); // 같은 학번이므로 중복저장안됨
		hashSet.add(new Student("1001300"));
		hashSet.add(new Student("1001400"));

		// 저장한 Student 수 출력
		System.out.println("저장된 Student 수: " + hashSet.size());
	}

}
