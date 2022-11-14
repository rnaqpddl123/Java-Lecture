package ch08.ex13_defaultMethod;

public class Main {

	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		//MyClassA에는 method1만 정의되어있지만 인터페이스에서 method2를 default로 만들었기때문에 사용가능
		mi1.method2();	
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();

	}

}
