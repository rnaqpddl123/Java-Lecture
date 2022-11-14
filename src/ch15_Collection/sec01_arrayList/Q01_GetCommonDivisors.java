package ch15_Collection.sec01_arrayList;
/**
 * 두개의 양의 정수를 매개변수로 받아 공약수를 찾은후
 * ArrayList를 반환하는 메소드
 * ch05.EX17_challenge참고
 */

import java.util.ArrayList;
import java.util.List;


public class Q01_GetCommonDivisors {

	public static void main(String[] args) {
		List<Integer> list = getCommonDivisors(12, 24);
		for (int i : list) {
			System.out.println(i);
		}	

	}
	
	public static List<Integer> getCommonDivisors (int a, int b){
		List<Integer> list = new ArrayList<>();
		int min = (a < b) ? a : b;
		for (int i = 1; i<=min; i++) {
			if (a % i == 0 && b % i == 0)
				list.add(i);
		}	
		
		return list;
	}

}
