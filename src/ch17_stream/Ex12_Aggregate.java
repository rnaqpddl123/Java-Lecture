package ch17_stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Ex12_Aggregate {

	public static void main(String[] args) {
		int[] intArr = {1, 3, 6, 2, 8};
		
		//2의 배수의 갯수
		long count = Arrays.stream(intArr)
						.filter(n -> n % 2 == 0)
						.count();
		System.out.println("2의 배수 개수: " + count);
		
		// 2의 배수의 합계
		int sum = Arrays.stream(intArr)
						.filter(n -> n % 2 ==0)
						.sum();
		System.out.println("2의 배수 합계: " + sum);
		
		//2의 배수의평균
		double avg = Arrays.stream(intArr)
						.filter(n -> n % 2 ==0)
						.average()	//Optionalxxx type 이라 마지막에 getAsDouble()추가
						.getAsDouble();
		System.out.println("2의 배수 평균: " + avg);
		
		//2의 배수의 최대값
		int max = Arrays.stream(intArr)
						.filter(n -> n % 2 ==0)
						.max()		//Optionalxxx type 이라 마지막에 getAsInt()추가
						.getAsInt();	
		System.out.println("2의 배수 최대값: " + max);
		
		//Optional
		//5의 배수의 평균
//		double average = Arrays.stream(intArr)
//								.filter(n -> n % 5 ==0)
//								.average()		// NoSuchElementException발생 (값이 없어서)
//								.getAsDouble();
//		System.out.println(average);
		
		
		//해결 방법1
		OptionalDouble optional = Arrays.stream(intArr)
										.filter(n -> n % 5 ==0) 
										.average();
		if(optional.isPresent())
			System.out.println("방법1 평균" + optional.getAsDouble());
		else
			System.out.println("방법1 평균: 0.0");
		
		//해결방법2
		double average =  Arrays.stream(intArr)
								.filter(n -> n % 5 ==0) 
								.average()
								.orElse(0.0);
		System.out.println("방법2 평균: " + average);
		
		//해결방법3	(권장하는 방법)
		// Exception이 발생하지않음, 단 아무것도 출력도 되지않음
		 Arrays.stream(intArr)
			.filter(n -> n % 5 ==0) 
			.average()
			.ifPresent(d -> System.out.println("방법3 평균: " + d));
		
				

	}

}
