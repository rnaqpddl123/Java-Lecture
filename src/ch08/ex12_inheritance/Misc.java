package ch08.ex12_inheritance;

// Ex12_parent한테 상속받음
public class Misc extends Parent implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("misc methodA");
	}

	@Override
	public void methodB() {
		System.out.println("misc methodB");
	}

	@Override
	public void methodC() {
		System.out.println("misc methodC");
	}

}
