package ch15_Collection.sec06_treeSet;

import java.util.Comparator;


public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		
//		return o1.price - o2.price;	// 가격 기준 오름차순
//		return o2.price - o1.price;	// 가격 기준 내림차순
		// 가격이 같다면 이름을 기준으로 가격이 다르다면 가격을 기준으로 오름차순 정렬
		return (o1.price==o2.price) ? o1.name.compareTo(o2.name) : o1.price - o2.price;
	}
	
	
}
