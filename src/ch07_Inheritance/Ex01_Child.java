package ch07_Inheritance;

public class Ex01_Child extends Ex01_Parent{
	int childInt;
	
	Ex01_Child() {}
	Ex01_Child(int childInt) {
		super(childInt*2);	//부모의 기본생성자가 있어야함
		this.childInt = childInt;
	}

	void childMethod() {
		System.out.println("자식" + childInt);
		
		
	}

}
