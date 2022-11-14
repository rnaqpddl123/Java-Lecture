package ch04;

import java.util.Scanner;

/**
 * 완성된 다이아몬드 그리기
 * 		num=7(홀수)		h(4)
 *        *		i :1~(num/2 +1)
 *       ***
 *      *****  space : k-i
 *     ******* 	* : 2*i -1
 *      *****  i : 1~num/2
 *       ***   space : i
 *        *    * : 5, 3, 1, (4-1)*2-1
 */

public class EX24_Diamond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
		System.out.print("10보다 작은 홀수를 입력하세요. >");
		num = scan.nextInt();
		}while(num<=10 || num%2==0);
		scan.close();
		int half = num/2;
		
		
		//다이아 상단부
		for (int i=1; i<=half+1; i++) {
			for (int k=1; k<=half-i+1; k++) {
				System.out.print(" ");
				}
			for (int h=1; h<=i*2-1; h++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		//다이아 하단부
		for (int i=1; i<=half; i++) {
			for (int k=1; k<=i; k++) {
				System.out.print(" ");
				}
			
			for (int h=1; h<=2*(half - i)+1; h++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
