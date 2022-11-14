package ch07_Inheritance;

/**
 * 다형성 (Polymorphism)
 */
public class Ex11_Polymorphism {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		// 아래와 같은게 다형성 자식이 부모의 타입으로 자동변환되는거 (Polymorphism)
		parent = child1;	// 자동변환 (자식은 부모의 타입으로 자동변환)
		parent = child2;
		parent = new Child1();
		

	}

}

class Parent {
	
}

class Child1 extends Parent {
	
}

class Child2 extends Parent {
	
}