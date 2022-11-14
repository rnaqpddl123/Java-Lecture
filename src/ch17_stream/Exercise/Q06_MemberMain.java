package ch17_stream.Exercise;

import java.util.Arrays;
import java.util.List;

public class Q06_MemberMain {

	public static void main(String[] args) {
		List<Q06_Member> list = Arrays.asList(
				new Q06_Member("홍길동", 30),
				new Q06_Member("신용권", 40),
				new Q06_Member("김자바", 26)
				);
		
		double avg = list.stream()
						.mapToInt(s -> s.getage())
						.peek(s -> System.out.println(s))
						.average()
						.getAsDouble();
		
		System.out.println("평균나이: " + avg);
		

	}

}
