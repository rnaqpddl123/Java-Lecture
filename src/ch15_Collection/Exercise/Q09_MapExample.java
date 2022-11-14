package ch15_Collection.Exercise;

import java.util.HashMap;
import java.util.Map;

public class Q09_MapExample {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;	// 최고 점수를 받은 아이디를 저장하는 변수
		int MaxScore = 0;	// 최고 점수를 저장하는 변수
		int TotalScore = 0;	// 점수 합계를 저장하는변수
		
		map.forEach( (k,v) -> System.out.println(k + "점수" + v));
		
		for (String s : map.keySet()) {
			if (MaxScore < map.get(s)) {
				MaxScore = map.get(s);
				name = s;
			}
			TotalScore += map.get(s);
		}

		System.out.println("최고점수받은 아이디: " + name );
		System.out.println("최고점수: " + MaxScore);
		System.out.println("점수합계: " + TotalScore);
		
		
	}

}
