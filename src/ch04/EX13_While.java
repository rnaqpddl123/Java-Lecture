package ch04;

import java.util.Scanner;

/**
 * 입력값 정수를 입력 합이 100보다 작을때까지 입력을 받음
 */

public class EX13_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while (sum < 100) {
			System.out.print("정수 입력> ");
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println(sum);

		// 의도적으로 무한 루프를 만들고 탈출조건을 루프안에서 만들어 줌
		sum = 0;
		while (true) { // 무한반복문 아래에서 조건문을 만들어 줘야함
			System.out.print("정수 입력> ");
			int num = scan.nextInt();
			sum += num;
			if (sum >= 100)
				break;
		}
		System.out.println(sum);
		scan.close();

	}

}
