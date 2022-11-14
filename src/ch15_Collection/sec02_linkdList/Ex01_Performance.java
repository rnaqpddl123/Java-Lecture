package ch15_Collection.sec02_linkdList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *  LinkedList와 ArrayList성능 비교
 *  List 앞에 추가하는것은 ArrayList가 시간이 더 소요됨
 *	ArrayList소요시간이 더 길다
 *	즉, LinkedListrk가 더 빠르다
 */

public class Ex01_Performance {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		
		// List 앞에 추가하는것은 ArrayList가 시간이 더 소요됨
		// ArrayList소요시간이 더 길다
		// 즉, LinkedListrk가 더 빠르다
		System.out.println("List앞에다 추가할때 걸리는 시간");
		//ArrayList
		long startTime = System.nanoTime();
		for (int i=0; i<10000; i++)
			al.add(0, String.valueOf(i));	// 0번째, 즉 제일 앞에다가 새로운 밸류값넣어줌`
		long endTime = System.nanoTime();
		System.out.println("ArrayList 소요 시간 :  " + (endTime - startTime) + "nano-sec");
		
		
		//LinkedList
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++)
			ll.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요 시간 : " + (endTime - startTime) + "nano-sec");
		
		
		// List뒤에 추가하기
		// 이때는 ArrayList가 더빠르다
		System.out.println("List뒤에 추가할때 걸리는시간");
		//ArrayList
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++)
			al.add(String.valueOf(i));	// 0번째, 즉 제일 앞에다가 새로운 밸류값넣어줌`
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요 시간 :  " + (endTime - startTime) + "nano-sec");
		
		
		//LinkedList
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++)
			ll.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요 시간 : " + (endTime - startTime) + "nano-sec");
			
		

	}

}
