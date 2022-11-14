package ch06;

public class Ex03_Overload {

	public static void main(String[] args) {
		
		int min = getMinimum(3, 4, 5);
		System.out.println(min);
		System.out.println(getMinimum(10,20,5));
		System.out.println(getMinimum(1.1, 8, 10));
		System.out.println(getMinimum(5, 8));
	}
	
	static int getMinimum(int a, int b) {
		return getMinimum(a, a, b);
	}
	
	static int getMinimum(int a, int b, int c) {
		int min = (a < b) ? a : b;
		min = (min < c) ? min : c;

		return min;
	}
	
	// 위와같이 method이름이 같아도 타입이 다르면 같은 이름을 쓸수있음
	static double getMinimum(double a, double b, double c) {
		double min = (a < b) ? a : b;
		min = (min < c) ? min : c;

		return min;
	}
	
	
	

}
