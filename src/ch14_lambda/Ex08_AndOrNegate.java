package ch14_lambda;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex08_AndOrNegate {

	public static void main(String[] args) {
		// 2의 배수 점수
		IntPredicate pA = a -> a % 2 == 0;
		// 3의 배수 검사
		IntPredicate pB = a -> a % 3 == 0;
		
		// 2와 3의 공배수 찾기
		IntPredicate pAB = pA.and(pB);
		System.out.println(pAB.test(6));	// true
		System.out.println(pAB.test(9));	// false
		
		// or()
		pAB = pA.or(pB);  // 2의 배수이거나 3의배수
		System.out.println(pAB.test(5));	//false
		System.out.println(pAB.test(9));	//true
		
		// negate() : not    pA가true면 false, false면 true
		pAB = pA.negate();
		System.out.println(pAB.test(6));	// false
		System.out.println(pAB.test(9));	// true
		System.out.println(pA.negate().test(9));	//풀어서 써본거
		
	}

}
