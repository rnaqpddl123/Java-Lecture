package ch11.sec11_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03_PrimitiveSort {

	public static void main(String[] args) {
		int[] scores = {78, 89, 95, 65};
		Arrays.sort(scores);	// 오름차순 정렬,자기 파괴적(다른데로 값을 보내는게 자기자신이 바뀜)
		System.out.println(Arrays.toString(scores));
		
		String[] fruits = "감 귤 사과 딸기".split(" ");
		//오름차순정렬
		Arrays.sort(fruits);	
		System.out.println(Arrays.toString(fruits));
		
		//내림차순정렬
		Arrays.sort(fruits, Comparator.reverseOrder());
		System.out.println(Arrays.toString(fruits));
		
	}

}
