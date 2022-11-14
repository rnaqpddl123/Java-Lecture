package ch15_Collection.sec04_hashMap;

import java.sql.ResultSetMetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex02_BoardHashMap {

	public static void main(String[] args) {
		Map<Integer, Board> map = new HashMap<>();
		
		// 내용 채우기
		for (int i=1; i<=5; i++)
			map.put(i, new Board("제목"+i, "내용" +i, "글쓴이" + i));
		
		// map출력
//		map.forEach((k, v) -> System.out.println(k + ": "+ v));	//lambda방식
//		Set<Integer> keySet = map.keySet(); 					// 변수(keySet)을 만들고 for문 돌리는 방식
//		for (int key : keySet)
//			System.out.println(key + ": " + map.get(key));
		for (int key : map.keySet())							// 변수 따로 안만드는 방식
			System.out.println(key + ": " + map.get(key));
		System.out.println();
		
		
		
		//객체 삭제
		map.remove(1);
		map.forEach((k,v) -> System.out.println(k + ": "+ v));
		

	}

}
