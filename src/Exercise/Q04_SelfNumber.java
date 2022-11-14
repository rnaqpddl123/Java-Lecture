package Exercise;
/*
 * 문제4) 셀프 넘버
셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과
n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.
양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을
만들 수 있다. 
예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 
다음 수는 51 + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.
33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의
생성자이다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있
다. 
생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 이 셀프
넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오
 */

import java.util.Arrays;
import java.util.Scanner;

/*
 * 52 -> 52+5+2=59 -> 59+5+9=73
 */

public class Q04_SelfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("어느숫자 이하의 셀프 넘버를 찾으려하나요?( 100이하만가능)");
		int findNum = scan.nextInt();
		System.out.println("내가 찍은 숫자" + findNum);
		selfNumberFind(findNum);

	}

	static void selfNumberFind(int findNum) {
		int[] finds = new int[100];
		int order = 0;
		for (int i = 1; i <= findNum; i++) { // findNum이하의 숫자에서 셀프넘버 찾으려고
			if (confirm(i)) {
				finds[order++] = i; // 셀프 넘버 넣기
			}
		}
//		System.out.println(order);
//		System.out.println(Arrays.toString(finds));
		int[] arr = Arrays.copyOf(finds, order);
		System.out.println(Arrays.toString(arr));
	}

	static boolean confirm(int findNum) { // 셀프넘버인지 아닌지 확인
		for (int k = 1; k < findNum; k++) {
			if (findNum == (k % 10 + k / 10 + k)) {
				return false;
			}
		}
		return true;

	}
}
