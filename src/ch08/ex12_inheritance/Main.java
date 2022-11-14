package ch08.ex12_inheritance;

public class Main {

	public static void main(String[] args) {
		InterfaceC ic = new ImplementClass();
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		
		Misc misc = new Misc();
		misc.methodA();
		misc.methodB();
		misc.methodC();
		misc.methodParent();
		
		// 다형성이 일어나서 받을수있다. 다만 ic.methodParent(); 는 받을수없다. 인터페이스에 없기때문에
		ic = misc;
		ic.methodA();
		ic.methodB();
		ic.methodC();
//		ic.methodParent();
	}

}
