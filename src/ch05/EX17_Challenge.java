package ch05;

import java.util.Arrays;

/**
 * 두개의 양의 정수를 커맨드 아규먼트로 입력받아서 공약수를 찾아서 배열에 집어넣기 step1. 두개의 양의 정수를 아규먼트로 입력받아서 각각
 * num1,num2 변수에 넣기 step2. 두수중 작은수만큼 for-loop을 돌면서 num1,num2로 나누어지는지 확인 step3.
 * 찾은수를 배열로 만들기 1)배열을 작은 수 만큼의 크기로 만든다. 2)스텝2에서 걸리진 공약수를 배열에 넣기 3)공약수의 갯수만큼 새로운
 * 배열에 넣기
 */

public class EX17_Challenge {

	public static void main(String[] args) {
		// 아규먼트길이가 2가이닐때 강제종료
		if (args.length != 2) {
			System.out.println("두개의 양의 정수를 입력하세요.");
			System.exit(1); // 시스템 강제종료
		}

		// 아규먼트 들어갔는지 확인
		for (int i = 0; i < args.length; i++) {
			System.out.println("아규먼트 입력값 : " + args[i]);
		}

		// args[0]타입확인
//		System.out.println(args[1].getClass().getName());
		// 변수밎어레이할당
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int a = 0;

		// 작은수찾기
//		if (num1 >= num2) {
//			standard = num2;
//		} else
//			standard = num1;
		// 위에처럼 if문말고 3항연산자로 처리
		int standard = (num1 < num2) ? num1 : num2;

		System.out.println("더작은값은" + standard);

		int[] CD = new int[standard / 2];

		// 공약수 찾아서 임시로 만든 배열에 값넣어주기
		for (int i = 1; i <= standard; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
//				CD[a] = i;
//				a += 1;

				// 위에 두줄을 아래 한줄로 바꾸기 가능
				CD[a++] = i;
			}
		}

		// 공약수갯수만큼의 길이의 배열을 새로 만들어주고 임시배열에서 복사해오기
		int[] finalCD = new int[a];
		System.arraycopy(CD, 0, finalCD, 0, a);
		System.out.println(Arrays.toString(CD));
		System.out.println(Arrays.toString(finalCD));

		// 강사님 버전
		int[] tmp = new int[standard];
		int index = 0;
		for (int i = 1; i <= standard; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				tmp[index++] = i;
			}
		}
		System.out.println("여기서부터 강사님풀이답 확인용");
		System.out.println("공약수의개수 - " + index);
		System.out.println(Arrays.toString(tmp));
		
		int [] commonArrays = Arrays.copyOf(tmp, index);
		System.out.println(Arrays.toString(commonArrays));

	}

}
