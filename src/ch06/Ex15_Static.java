package ch06;

public class Ex15_Static {
	static double pi = 3.141592;
	static final double PI = 3.142592;	//final은 값 변경불가,변수이름은 전부 대문자로 작성
	int x; // instance field

	static int power(int base, int exponent) {
		int res = 1;
		for (int i = 1; i <= exponent; i++)
			res *= base;
		return res;
	}

	static double circleArea(double radius) {
		return pi * radius * radius;
	}

	// static 영역에서는 instance filed를 쓸수없지만
	// instance 영역에서는 instance field와 static부분을 둘다 쓸수있다.
	// 단, 같은class 내에서만 그렇고 class가 다르면 상관없이 쓸수있다.
	int power2() { // instance method
		int res = 1;
//		System.out.println(pi);		//instance영역에서도 static부분을 쓸수있다.
		for (int i = 1; i <= x; i++)
			res *= 2;
		return res;
	}

}
