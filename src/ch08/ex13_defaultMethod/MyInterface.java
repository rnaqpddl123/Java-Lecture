package ch08.ex13_defaultMethod;

public interface MyInterface {
	abstract void method1();
	
	// 처음만들때는 사용안하고 추후에 추가할게있을때정도만 default를 사용함
	public default void method2() {
		System.out.println("MyClassA - method2()");
	}
}