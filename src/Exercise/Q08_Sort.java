package Exercise;

import java.util.Arrays;
/*
 * Bubble sort + Selection sort를 혼합한 방법
 */

public class Q08_Sort {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 7, 2, 3 };
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			for (int k = i; k < arr.length; k++) {
				if (arr[i] > arr[k]) { // 오름차순
					int tmp = arr[i];
					arr[i] = arr[k];
					arr[k] = tmp;

				}
			}
		}
		System.out.println("오름차순");
		System.out.println(Arrays.toString(arr));

		ArrSort(arr);

	}

	static void ArrSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int k = i; k < arr.length; k++) {
				if (arr[i] < arr[k]) { // 내림차순
					int tmp = arr[i];
					arr[i] = arr[k];
					arr[k] = tmp;

				}
			}
		}
		System.out.println("외부메소드 내림차순");
		System.out.println(Arrays.toString(arr));
	}

}
