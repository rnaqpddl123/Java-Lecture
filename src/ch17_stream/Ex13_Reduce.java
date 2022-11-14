package ch17_stream;

import java.util.ArrayList;
import java.util.List;

public class Ex13_Reduce {

	public static void main(String[] args) {
		List<Ex13_Student> list = new ArrayList<>();
		list.add(new Ex13_Student("홍길동", 94));
		list.add(new Ex13_Student("신길동", 80));
		list.add(new Ex13_Student("신용권", 90));
		
		// 방법1
		int sum1 = list.stream()
						.mapToInt(Ex13_Student::getScore)	// mapToInt(st -> st.getScore()) 와 같다
						.sum();
		System.out.println("방법1: " + sum1);
		
		//방법2
		int sum2 = list.stream()
						.filter(st -> st.getScore() % 2 == 1)
						.mapToInt(Ex13_Student::getScore)
						.reduce(0, (a, b) -> a + b);		//Exception이 발생하면 0
		System.out.println("방법2: " + sum2);
	}

}
