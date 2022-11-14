package Exercise;

/*
 * 문제5) 완전수(Perfect number)
자기 자신을 제외한 모든 양의 약수들의 합이 자기 자신이 되는 자연수를 완전수라고 한다. 
예를 들면, 6과 28은 완전수이다. 
6=1+2+3 // 1,2,3은 각각 6의 약수
28=1+2+4+7+14 // 1,2,4,7,14는 각각 28의 약수
10000 미만의 완전수는 모두 4개가 있다. 이 완전수를 구하는 프로그램을 작성하시오
 */
public class Q05_Exercises {

	public static void main(String[] args) {
		//  메소드를 만들어서 해결한것, 이 방법이 좋음
		for (int i = 2; i < 10000; i++) {
			if (isPerfectNumber(i))
				System.out.println(i);
		}
		
		// 아래 방법은 main에다가 직접만든것
		for (int i =2; i<10000; i++) {
			int sum = 0;
			for (int k=1; k<=i/2; k++) {
				if (i % k == 0) 		// i가 num의 약수
					sum +=k;
			}
			if (i == sum)
				System.out.println(i);	
		}
	}
	
	static boolean isPerfectNumber(int num) {
		int sum = 0;
		for (int i=1; i<=num/2; i++) {
			if (num % i == 0) 		// i가 num의 약수
				sum +=i;
		}
		return num ==sum;
	}

}
