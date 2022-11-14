package ch05;

import java.util.Arrays;
import java.util.Random;

/**
 * length가 30인 정수형 배열 score에 100보다 작은 정수값을 입력하고 
 * 이배열에서 가장 크고 작은 수를 찾으세요
 */

public class EX18_Max {

	public static void main(String[] args) {
		// 변수할당
		Random ran = new Random();
		int[] score = new int[30];
		int max = 0;
		int min = 100;

		// 배열에 값 집어넣고 max값찾기
		for (int i = 0; i < score.length; i++) {
			score[i] = ran.nextInt(100);
			if (max < score[i])
				max = score[i];
			if (min > score[i])
				min = score[i];
		}

		System.out.println(Arrays.toString(score));
		System.out.println(max);
		System.out.println(min);

	}

}
