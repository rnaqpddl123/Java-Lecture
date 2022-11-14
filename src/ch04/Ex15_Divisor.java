package ch04;

import java.util.Scanner;

/*
 * 10보다 큰 정수를 입력으로 받아 약수(Divisor)을 찾아주는 프로그램을 작성하세요
 */

public class Ex15_Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("10보다 큰 정수를 입력하세요> ");
			num = scan.nextInt();	
			if (num>10)
				break;
		}
		scan.close();
		
		for (int i = 1; i <= (num / 2); i++) {
			if (num % i == 0)
				System.out.print(" " +i);
		}

	}

}
