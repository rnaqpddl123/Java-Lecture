package ch04;
/*
 * 만 나이 계산하기
 * 
 * 생년월일을 입력으로 받아, 오늘 현재 만나이를 구하세요
 * 
 */

import java.time.LocalDate;
import java.util.Scanner;

public class EX06_FullAge {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());

		System.out.print("생년월일 8자리를 입력해주세요.>");
		Scanner scan = new Scanner(System.in);
		int birthday = scan.nextInt();

		int old = (today.getYear() * 10000 - birthday) / 10000 + 1;
		if ((today.getMonthValue() * 100 + today.getDayOfMonth()) - (birthday % 10000) <= 0) {
			old = old - 1;
		}
		System.out.printf("현재 만나이는%d입니다\n", old);

		
		
		
		// 강사님 풀이
		System.out.println("생년> ");
		int bYear = scan.nextInt();
		System.out.println("생월> ");
		int bMonth = scan.nextInt();
		System.out.println("생일> ");
		int bDay = scan.nextInt();
		LocalDate birthDay = LocalDate.of(bYear, bMonth, bDay);
		System.out.println(birthday);
		scan.close();

		LocalDate Today = LocalDate.now();
		System.out.println("오늘 날짜: " + today);
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();

		int fullAge;
		if (tMonth > bMonth) {
			fullAge = tYear - bYear;
		} else if (tMonth < bMonth) {
			fullAge = tYear - bYear - 1;
		} else { // tMonth와 nMonth가 같을경우
			if (tDay >= bDay)
				fullAge = tYear - bYear;
			else
				fullAge = tYear - bYear - 1;
		}
		System.out.println("만 나이는 " + fullAge + "입니다");

	}

}
