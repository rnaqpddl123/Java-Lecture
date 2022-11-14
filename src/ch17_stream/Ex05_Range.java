package ch17_stream;

import java.util.stream.IntStream;

public class Ex05_Range {
	public static int sum = 0;

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10);		//[1,10), 1~9
		stream.forEach(i -> System.out.println(i));

		stream = IntStream.rangeClosed(1, 10);
		stream.forEach(i -> System.out.println(i));		//[1,10], 1~10
		
		stream = IntStream.rangeClosed(1, 100);
//		int sum = 0;	//이와 같이 local변수로 정해둔거는 사용할수없다. 밖에다가 static으로 정의해둬야함
		stream.forEach(i -> sum += i);
		System.out.println("총합: " + sum);
	}

}
