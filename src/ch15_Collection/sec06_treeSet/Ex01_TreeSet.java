package ch15_Collection.sec06_treeSet;
/**
 * 대중적으로 사용되지는 않음
 * 자동적으로 정렬이되어있는 특징이있다
 * 디폴트 값은 오름차순
 */

import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex01_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		int[] arr = {87, 98, 75, 95, 80};
		for (int score : arr)
			scores.add(score);
		for(int score : scores)
			System.out.println(score);	// 따로 sort안해도 자동정렬이되어있다.
		
		
		//특정 객체 가져오기
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		System.out.println("95점 바로 아래 점수: " + scores.lower(95));	
		System.out.println("95점 바로 위에 점수: " + scores.higher(95));
		System.out.println("95점 이거나 바로 아래 점수: " + scores.floor(95));
		System.out.println("95점 이거나 바로 위에 점수: " + scores.ceiling(95));
		System.out.println("85점 이거나 바로 위에 점수: " + scores.ceiling(85));
		System.out.println();
		
		
		//내림차순으로 정렬
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for(int s : descendingScores)
			System.out.println(s);
		System.out.println();
		System.out.println("내림차순일 경우에는 first가 가장큰값: " + descendingScores.first()); 
		System.out.println();
		
		
		
		// 범위 검색 (80 < score)
		NavigableSet<Integer> rangeSet = scores.tailSet(80, false);	//true일경우에는 80포함, false일경우에는 80미포함
		for (int s: rangeSet)
			System.out.println(s);
		System.out.println();
		
		//범위 검색 (80 <=score < 90)
		rangeSet = scores.subSet(80, true, 90, false);
		for (int s : rangeSet)
			System.out.println(s);
		
	}

}
