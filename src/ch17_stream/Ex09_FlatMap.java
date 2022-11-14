package ch17_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex09_FlatMap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a quick brown fox");
		list.add("jumps over the lazy dog");
		list.forEach(str -> System.out.println(str));
		System.out.println();
		
		// 문장 스트림을 단어 스트림으로변환 
		list.stream()
			.flatMap(str -> Arrays.stream(str.split(" ")))
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		// 문자열 숫자 목록 스트림을 숫자 스트림으로변환
		List<String> l = Arrays.asList("10, 20, 30", "40, 50");
		l.stream()
		 .flatMapToInt(str -> {
			 String[] strArr = str.split(", ");
			 int[] intArr = new int[strArr.length];
			 for (int i = 0; i< strArr.length; i++)
				 intArr[i] = Integer.parseInt(strArr[i].trim());		// .trim()은 space같은게 있으면 없애줌
//			 System.out.println(Arrays.toString(intArr));				// .flatMapToInt가 언제 적용되는지 궁금해서 찍어봄
			 return Arrays.stream(intArr);
		 } )
		 .forEach(number -> System.out.println(number));
		/*
		 * ["10, 20, 30", "40, 50"]의 문자열을 [["10", "20", "30"], ["40", "50"]]의 형태로 바꿔주고
		 * [[10, 20, 30], [40, 50]으로 정수값으로 변환 
		 * flatMapToInt을 통해 [10,20,30,40,50]처럼 1차원으로 변환
		 */
		
		
		 
		
			
		
	}

}
