package ch15_Collection.sec06_treeSet;

import java.util.TreeSet;

public class Ex03_FruitComparator {

	public static void main(String[] args) {
		TreeSet<Fruit> ts = new TreeSet<>(new FruitComparator());
		// 람다식 이용하면 FruitComparator 클래스를 따로 만들지 않아도됨
		// 람다식을 이용해서 오름차순 정렬 다만 이렇게되면 Set이라서 price가 같다면 저장이 안됨
//		TreeSet<Fruit> ts = new TreeSet<>((o1,o2) -> o1.price - o2.price);
		// 같은 람다식 이용했지만 기준을 name으로해서 price가 같아도 저장가능 (이때는 name이 같으면 저장X)
//		TreeSet<Fruit> ts = new TreeSet<>((o1,o2) -> o1.name.compareTo(o2.name));
		
		
		
		ts.add(new Fruit("Grape", 3000));
		ts.add(new Fruit("Melon", 10000));
		ts.add(new Fruit("Strawberry", 6000));
		ts.add(new Fruit("Banna", 6000));
		ts.add(new Fruit("Banna", 8000));
		

		for (Fruit fruit : ts)
			System.out.println(fruit.name + ": " + fruit.price);
	}

}
