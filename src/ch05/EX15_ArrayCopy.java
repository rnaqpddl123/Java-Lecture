package ch05;

import java.util.Arrays;

/**
 * 배열 복사 단, 1차원 배열에서만 적용됨
 */

public class EX15_ArrayCopy {

	public static void main(String[] args) {
		int[] src = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] dst = new int[8];
		// src[2]부터 끝까지 dst[]에 복사
		for (int i = 2; i < src.length; i++) {
			dst[i - 2] = src[i];
		}
		System.out.println(Arrays.toString(dst));

		String[] srcStrArray = { "A", "quick", "brown", "fox" };
		String[] dstStrArray = new String[7];
		// srcStrArray를 dstStrArray[1]부터 복사
		// (복사할어레이,복사시작지점,집어넣을어레이,어디부터 집어넣을껀지,얼마나 넣을껀지)
		System.arraycopy(srcStrArray, 0, dstStrArray, 1, srcStrArray.length);
		System.out.println(Arrays.toString(dstStrArray));

		int[] newArray = Arrays.copyOf(dst, 10);
		System.out.println(Arrays.toString(newArray));

	}

}
