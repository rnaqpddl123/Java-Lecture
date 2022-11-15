package ch17_stream.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q07_FilterMain {

	public static void main(String[] args) {
		List<Q07_Member> list = Arrays.asList(
				new Q07_Member("홍길동", "개발자"),
				new Q07_Member("김나라", "디자이너"),
				new Q07_Member("신용권", "개발자")
				);
		
		List<Q07_Member> developers = list.stream()
										.filter(s -> s.getJob().matches("개발자"))
										.collect(Collectors.toList());
//										.toList();
		
		developers.forEach(s -> System.out.println(s.getName()));

	}

}
