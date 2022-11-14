package ch04;

import java.util.Random;
import java.util.Scanner;

/**
 * 예제 양의 정수(1~100)
 * 
 * 3의 배수 - Fizz 5의 배수 - Buzz 3과 5의 배수 FizzBuzz 아니면 숫자
 * 
 */

public class Ex05_FizzBuzz {

	public static void main(String[] args) {
		// 임의의 정수값을 생성
		Random ran = new Random(); // 객체 생성
		int number = ran.nextInt(100) + 1; // 1~100까지 임의의 정수값 생성
		System.out.println("number=" + number);
		System.out.println(number + "=" + fizzBuzz(number));
		System.out.println(((Object) number).getClass().getSimpleName()); // 타입 확인용
		System.out.println(((Object) fizzBuzz(number)).getClass().getSimpleName());

		System.out.print("1에서 100까지 정수를 입력하세요.>");
		Scanner scan = new Scanner(System.in); // 객체 생성
		int num = scan.nextInt(); // console 창에서 내가 입력값을 넣을수있음
		scan.close();
		System.out.println(num + "=" + fizzBuzz(num));

	}

	public static String fizzBuzz(int number) {
		String result;
		if (number % 3 == 0 && number % 5 == 0)
			result = "FizzBuzz";
		else if (number % 3 == 0)
			result = "Fizz";
		else if (number % 5 == 0)
			result = "Buzz";
		else
			result = Integer.toString(number);
		return result;

	}

	public static String fizzBuzz2(int number) {
		if (number % 3 == 0 && number % 5 == 0)
			return "FizzBuzz";
		else if (number % 3 == 0)
			return "Fizz";
		else if (number % 5 == 0)
			return "Buzz";
		else
			return Integer.toString(number);
	}

}
