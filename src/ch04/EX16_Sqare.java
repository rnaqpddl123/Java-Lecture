package ch04;

import java.util.Scanner;

/**
 * 10보다 큰 정수를 입력으로 받아 1부터 입력받은 숫자까지의 제곱의합과 합의 제곱을 구하세요
 */

public class EX16_Sqare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int sumOfSquare = 0, sum = 0, squareOfSum = 0;

//		while (true) {
//			System.out.print("10보다 큰 정수를 입력하세요. > ");
//			num = scan.nextInt();
//			if (num > 10)
//				break;
//		}
		do {		//위에 while문과 같은 do~while문 근데 그냥while문쓰자
			System.out.print("10보다 큰 정수를 입력하세요. > ");
			num = scan.nextInt();
		} while (num <= 10);
		scan.close();

		for (int i = 1; i <= num; i++) {
			sum += i; // 합
			sumOfSquare += i * i; // 제곱의 합
		}
		squareOfSum = sum * sum;
		System.out.println("제곱의 합은" + sumOfSquare + " 입니다.");
		System.out.println("합의 제곱은" + squareOfSum + " 입니다.");

	}

}
