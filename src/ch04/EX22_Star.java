package ch04;

import java.util.Scanner;

/**
 * 별 모양으로 삼각형 그리기
 */

public class EX22_Star {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("8보다 작은 정수를 입력하세요.> ");
			num = scan.nextInt();
		} while (num >= 8);
		scan.close();

		// 1사분면
		System.out.println("1사분면");
		for (int i = 1; i <= num; i++) { // i : 1~5
			for (int k = 1; k <= i; k++) { // k : i번만큼
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n4사분면");
		// 4사분면
		for (int i = num; i >= 1; i--) { // i : 1~5
			for (int k = 1; k <= i; k++) { // k : i번만큼
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n2사분면");
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= num - i; k++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n3사분면");
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= num - i; k++) { // num - i번만큼
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
