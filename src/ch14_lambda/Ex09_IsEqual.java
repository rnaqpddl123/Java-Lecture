package ch14_lambda;

import java.util.function.Predicate;

public class Ex09_IsEqual {

	public static void main(String[] args) {
		Predicate<String> predicate;
		
		// 값이 같으면 true 다르면 false
		predicate = Predicate.isEqual(null);
		System.out.println("null, null: " +predicate.test(null));
		
		predicate = Predicate.isEqual("Java");
		System.out.println("Java, Java: " + predicate.test("Java"));
	
		predicate = Predicate.isEqual(null);
		System.out.println("null, Java: " + predicate.test("Java"));
		
		predicate = Predicate.isEqual("Java");
		System.out.println("Java, null: " +predicate.test(null));
		
		predicate = Predicate.isEqual("Java11");
		System.out.println("Java11, Java8: " +predicate.test("java8"));
		
		
		

	}

}
