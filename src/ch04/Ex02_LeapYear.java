package ch04;

/**
 * 연습문제 4의배수면 윤년 100의 배수면 평년 400의 배수면 윤년 1996,2000,1900,2022
 */

public class Ex02_LeapYear {

	public static void main(String[] args) {
		// 강사님 풀이
		System.out.println("1996년은 " + leapYear(1996) + "입니다.");
		System.out.println("2000년은 " + leapYear(2000) + "입니다.");
		System.out.println("1900년은 " + leapYear(1900) + "입니다.");
		System.out.println("2022년은 " + leapYear(2022) + "입니다.");

		System.out.println("1996년은 " + leapYear2(1996) + "입니다.");
		System.out.println("2000년은 " + leapYear2(2000) + "입니다.");
		System.out.println("1900년은 " + leapYear2(1900) + "입니다.");
		System.out.println("2022년은 " + leapYear2(2022) + "입니다.");

		int asd = 1234;
		System.out.println(asd + "년은 " + leapYear2(asd) + "입니다.");

	}

	private static String leapYear(int year) {
		String result;
		if (year % 400 == 0)
			result = "윤년";
		else if (year % 4 == 0 && year % 100 != 0)
			result = "윤년";
		else
			result = "평년";
		return result;
	}

	// 이코드가 좀더 간결함
	private static String leapYear2(int year) {
		if (year % 400 == 0)
			return "윤년";
		if (year % 4 == 0 && year % 100 != 0)
			return "윤년";
		return "평년";
	}

}
