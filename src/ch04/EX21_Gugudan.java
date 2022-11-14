package ch04;
/**
 * 구구단
 */

public class EX21_Gugudan {

	public static void main(String[] args) {
		for (int i = 2; i<=9; i++) {
			for (int k=1; k<=9;k++) {
				System.out.printf("%d x %d = %d\n",i,k,i*k);
			}
			System.out.println("===========================");
		}
	}

}
