package ch17_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *  Boxed - Wrapper
 */

public class Ex08_Boxed {

	public static void main(String[] args) {
		int[] intArray = {1, 3, 4, 6, 7};
		
		IntStream intStream = Arrays.stream(intArray);
		// 타입 double로 변경
		intStream.asDoubleStream()
				 .forEach(d -> System.out.println(d));
		System.out.println();
		
		//stream은 한번 열리면 닫히기 때문에 한번 사용한뒤에는 다시 선언을 해주어야함(Stream은 1회용, 다시만들어줘야함)
		//최종처리한번하면 다시 열어줘야한다.
		// Integer로 변경
		intStream = Arrays.stream(intArray);
		intStream.boxed()
				 .forEach(obj -> System.out.println(obj.intValue()));

	}

}
