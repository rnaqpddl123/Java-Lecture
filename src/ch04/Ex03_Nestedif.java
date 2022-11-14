package ch04;

/**
 * 예제) 학점 90<score <=93 A- 94<score <= 96 A0 96<score <=100 A+
 * 
 * 80<score <=83 B- 84<score <= 86 B0 86<score <=90 B+
 */

public class Ex03_Nestedif {

	public static void main(String[] args) {
		int score = 88;
		String grade;
		if (score > 90) {
			if (score >= 97)
				grade = "A+";
			else if (score >= 94)
				grade = "A0";
			else
				grade = "A-";
		} else if (score > 80) {
			if (score >= 87)
				grade = "B+";
			else if (score >= 84)
				grade = "B0";
			else
				grade = "B-";
		} else {
			grade = "C";

		}
		System.out.println(score + "점은 " + grade + "입니다.");

	}
}
