package ch03;

/**
 * 이항연산자
 */
public class Ex03_Binary {

	public static void main(String[] args) {

		int a = 2000000000;
		int b = a * 2; // int 표시 범위를 벗어남
		System.out.println(b); // 표기값이 이상함 --> 앞에 MSB가 1이되면서 음수처리되서 그런듯
		System.out.printf("%d, %d\n", Integer.MAX_VALUE, Integer.MIN_VALUE);
		// 아래 safeAdd method를 갖고와서 실행시킴
		System.out.println(safeAdd(a, a)); // a+a가 MAX_VALUE를 넘어가기 때문에 0을 반환받음
		System.out.println(safeAdd(-a, -a)); // -a-a가 MIN_VALUE를 넘어가기때문에 0을 반환받음
		System.out.println(safeAdd(a, 100000000)); // a+100000000이 MAX_VALUE값보다 작기때문에 a+100000000을 반환받음

		int c = 3, d = 4;
		int res1 = c / d; // 0.75 결과값이 정수로 받게 되므로 0이 됨
		System.out.println("res = " + res1);
		double res2 = c / d;
		System.out.println("res2 = " + res2);
		double res3 = c / (double) d; // 둘중하나는 double로 바꿔줘야함 부호연산자의 산출타입은 int라서
		System.out.println("res3 = " + res3);
		double res4 = (double) c / d;
		System.out.println("res4 = " + res4);
		System.out.println(3. / 4); // 이와같이 literal로 할때는.을 붙여서 실수타입으로 해줘야함

		System.out.println(Double.NaN); // ex) 0.0 / 0.0 같은 결과 ->Nan(부정)
		System.out.println(Double.POSITIVE_INFINITY); // ex)3.0 / 0.0 ->INFINITY(불능), 값이 무한대가 나오기떄문

		try {
			System.out.println(3. / 0); // 예전에는 Infinity라서 예외처리로 빠졋는데 버전이 올라가서 infinity로 나옴
		} catch (Exception e) {
			System.out.println("오버플로우 발생");
		}

		// 비교 연산자
		System.out.println(3 == 3); // true
		// 실수 비교
		System.out.println(3.0 == 3.0); // 실수 연산에서 같으냐를 비교하는것은 굉장히 위험하다
		// 3.0을 정확히 3.0으로 표현 못하기 떄문
		System.out.println(3.0 == 1.2 + 3.4 - 1.6); // 이와 같이 3.0==3.0일텐데 false가 뜬다
		// 이를 해결하기위해서 아래와 같이 표현한다, Math.abs는 절대값
		System.out.println(Math.abs(3.0 - (1.2 + 3.4 - 1.6)) < 1e-15);

		// 문자열 비교 - 문자열은 참조형
		String str1 = "홍길동"; // 리터럴로 문자열 할당(Heap memory)
		String str2 = "홍길동";
		String str3 = new String("홍길동"); // 문자열 객체를 만들어서 할당(Stack memory)
		System.out.println(str1 + str2 + str3);
		System.out.println(str1 == str2); // 동일하게 리터럴이 저장되어 있는곳을 가리킴
		System.out.println(str1 == str3); // false, 다른기억장소에 보관되어 있어서
		System.out.println(str1.equals(str3)); // 올바른 비교 방법

	}

	private static int safeAdd(int x, int y) { // method, 다른언어에서는 함수
		if (x > 0 && y > 0 && y > Integer.MAX_VALUE - x)
			return 0;
		if (x < 0 && y < 0 && y > Integer.MIN_VALUE - x)
			return 0;

		return x + y;
	}

}
