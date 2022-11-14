package ch14_lambda.Exercise;

import java.util.function.Function;

/**
 * 람다식 확인문제 6번
 */

public class Q06_main {
	
	public static void main(String[] args) {
		double result = calc((x, y) -> (x / y));
		System.out.println("result: " + result);
	}
	
	public static double calc(Q06_MyFunction fun) {
		double x = 10;
		double y = 4;
		return fun.apply(x, y);
	}

}
