package ch10;

public class practice {
	public static void main(String[] args) {
		int[] arr = { 5, 20, 4, 59, 8 };

		int sum = 0, index = 0;

		try {
			while (true) {
				sum += arr[index++];
			}
		} catch (Exception e) {
			System.out.println("배열의합은 " + sum + "입니다");
		}
	}

}
