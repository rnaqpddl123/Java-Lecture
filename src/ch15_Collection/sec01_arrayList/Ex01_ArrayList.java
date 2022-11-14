package ch15_Collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// list에 추가
		list.add("Java");
		list.add("JDBC");
		list.add("JSP/Servlet");
		// list 출력 (구닥다리방식)	(추천X)
		for (int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		// list출력	이거추천
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		
		// index값을 줘서 중간에 넣거나 삭제할수있음
		list.add(2, "Database");	//3번째에 Database를 넣어줌(중간삽입)
		list.add("iBaTIS");
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		
		list.remove(2);		// Database삭제
		list.remove(2);		// JSP/Servlet 삭제
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		// length 확인용
		for (String str : list)
			System.out.println(str + " : " + str.length());
		System.out.println();
		
		
		// 5글자 초과 데이터 삭제
		list.removeIf(s -> s.length() > 5);		// iBaTIS 삭제
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		
		// 내용 변경
		list.set(0, "Java-11");
		list.set(1, "JDBC8.0");
		for (String str : list)
			System.out.println(str);
		System.out.println();
			
		
		System.out.println(list.isEmpty());		//	list가 빈 list인지확인, 내용물있어서 false
		System.out.println(list.contains("Java-11"));	//"Java-11"있어서 true
		
		
		
		System.out.println("리스트 크기 : " +list.size());
		// list 내용물 삭제
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println("리스트 크기 : " +list.size());
		
	}

}
