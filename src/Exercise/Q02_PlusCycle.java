package Exercise;

import java.util.Scanner;

public class Q02_PlusCycle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 99 사이의 정수> ");
		int num = scan.nextInt();
		scan.close();

		System.out.println(plusCycle(num));

	}

	static int plusCycle(int num) {
		int originalNum = num;
		int cycle = 0;
		while (true) {
			cycle++;
			int digit10 = (num < 10) ? num : num / 10;
			int digit1 = num % 10;
			num = digit1 * 10 + (digit1 + digit10) % 10;
			System.out.println(num);

			if (num == originalNum) {
				System.out.println(cycle + "번만큼 걸렸습니다.");
				return cycle;
			}
		}
	}

}
