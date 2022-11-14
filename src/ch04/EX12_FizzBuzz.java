package ch04;

public class EX12_FizzBuzz {

	public static void main(String[] args) {
		// 밑에서 만든 함수이용
		for (int i = 1; i <= 100; i++) {
			System.out.print(fizzBuzz(i) + " ");
		}

		// 줄바꿈용
		System.out.println();

		// 함수 이용안한거
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0)
				System.out.print("FizzBuzz ");
			else if (i % 3 == 0)
				System.out.print("Fizz ");
			else if (i % 5 == 0)
				System.out.print("Buzz ");
			else
				System.out.print(i + " ");
		}
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
}
