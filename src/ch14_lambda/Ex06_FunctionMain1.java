package ch14_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import ch10.practice;

public class Ex06_FunctionMain1 {
	private static List<Ex06_Student> list = Arrays.asList(
			new Ex06_Student("홍길동", 90, 80),
			new Ex06_Student("김자바", 70, 50)
			);
	
	public static void printString(Function<Ex06_Student, String> f) {
		for (Ex06_Student student : list) {
			System.out.print(f.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Ex06_Student> f) {
		for (Ex06_Student student : list) {
			System.out.print(f.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static double avg(ToIntFunction<Ex06_Student> f) {
		int sum = 0;
		for(Ex06_Student student : list)
			sum += f.applyAsInt(student);
		double avg = (double) sum / list.size();
		return avg;
	}
		
	public static void main(String[] args) {
		System.out.print("학생 이름: ");
//		printString(Ex06_Student -> Ex06_Student.getName());
		// Ex06_Student 대신 t써도 가능
		printString(t -> t.getName());
		
		System.out.print("영어 점수: ");
		printInt(t -> t.getEngScore());
		
		System.out.print("수학 점수: ");
		printInt(t -> t.getMathScore());
		
		double engAvg = avg(s -> s.getEngScore());
		System.out.println("영어 평균 점수: " + engAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
		
	}

}
