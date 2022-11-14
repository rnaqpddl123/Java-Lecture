package Exercise;

import java.util.Scanner;

public class Q06_caesarCipher {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("영어 문장 입력> :");
		String plainText = scan.nextLine();
		System.out.println("스텝> ");
		int step = scan.nextInt();
		scan.close();
		String cipherText = plain2cipher(plainText, step);
		System.out.println(cipherText);

		String cipherText1 = cipher2plain(cipherText, step);
		System.out.println(cipherText1);

	}

	// 암호화
	static String plain2cipher(String text, int step) {
		char[] cipherText = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {

			char c = text.charAt(i);
			char d;
			if (c == ' ') { // 빈칸일때
				cipherText[i] = c;
				continue;
			}
			// 대문자일때
			if (c >= 'A' && c <= 'Z') {
				d = (char) (c + step);
				if (d > 'Z')
					d = (char) (d - 26);
			} else { // 소문자일때
				d = (char) (c + step);
				if (d > 'z')
					d = (char) (d - 26);
			}
			cipherText[i] = d;
		}

		return new String(cipherText);
	}

	// 복호화(암호해제)
	static String cipher2plain(String text, int step) {
		char[] plainText = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == ' ') {
				plainText[i] = c;
				continue;
			}

			char d = (char) (c - step);
			if (d < 'A')
				d = (char) (d + 26);
			plainText[i] = d;
		}
		return new String(plainText);
	}
}
