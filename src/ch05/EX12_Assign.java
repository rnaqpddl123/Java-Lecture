package ch05;

import java.util.Arrays;
import java.util.Random;

/**
 * 배열에 값 할당하기
 */

public class EX12_Assign {

	public static void main(String[] args) {
		// 주사위를 10번 던진 결과를 dice 배열에 집어넣기
		int[] dice = new int[10];
		Random ran = new Random();
		for (int i = 0; i < dice.length; i++) {
			dice[i] = ran.nextInt(6) + 1; // nextInt(6) [0,6) 0은포함, 6은 미포함
		}
		System.out.println(Arrays.toString(dice));

		// 학생 30명의 시험점수에 51~100 값을 집어넣고 평균 구하기
		int[] score = new int[30];
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = ran.nextInt(50) + 51;
			sum += score[i];
		}
		System.out.println((double) sum / score.length);
//		System.out.println(Arrays.toString(score));
		// 한줄에 6명의 성적이 나타나도록 출력
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%3d", score[i]); // %3d는 3자리의정수값으로 집어넣으라는의미 (줄맞추려고)
			if ((i + 1) % 5 == 0)
				System.out.println();
			else
				System.out.print(", ");
		}
		
		for(int i =0; i <args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
