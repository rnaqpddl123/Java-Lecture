package ch07_Inheritance;

public class Ex14_parent {
	String name = "부모";
	void parentMethod() {
		System.out.println("Parent: " + name);
	}
}

class Son extends Ex14_parent {
	String sonName = "아들";
	void sonMethod() {
		System.out.println("Son: " + sonName);
	}
	@Override
	void parentMethod() {
		System.out.println("Son: " + name);
	}
}

class Daughter extends Ex14_parent {
	String daughterName = "딸";
	void daughterMethod() {
		System.out.println("DaughterName: " + daughterName);
	}
	@Override
	void parentMethod() {
		System.out.println("DaughterName: " + name);
	}
}
