package ch11;

import java.util.Arrays;
import java.util.Random;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Ex14_Random {

	public static void main(String[] args) {
		//seed값으로 2022(난수를 만드는 알고리즘에 사용하는seed값을 고정)
		Random seedRandom = new Random(2022);		
		// seed값이 고정되어서 몇번을 반복해도 random이여도 같은값이 나오게됨
		System.out.println(seedRandom.nextInt(100));
		
		
		Random random = new Random();
		System.out.println("Lotto");
		int[] lotto = new int[6];
		int index = 0;
		//아래 방법은 중복이 나올수가있음
//		for (int i=0; i<6; i++) {
//			lotto[i] = random.nextInt(45) + 1;
//		}
//		System.out.println(Arrays.toString(lotto));
		
		
		// 중복 방지하는방법
		while (index < 6) {
			int num =  random.nextInt(45) + 1;
			if (!isValidNumber(num, lotto))
				continue;
			lotto[index++] = num;
			}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
	}
	
	static boolean isValidNumber(int num, int[] lotto) {
		for (int a : lotto) {
			if(num == a)
				return false;
		}
		return true;
	}

}
