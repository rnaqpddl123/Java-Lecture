package ch07_Inheritance;

public class Ex02_Override {

	public static void main(String[] args) {
		Ex02_Parent parent = new Ex02_Parent();
		parent.parentInt = 10;
		parent.parentMethod();
		
		Ex02_Child child = new Ex02_Child();
		child.childInt = 200;
		child.parentInt = 300;
		child.parentMethod();
		
		// Parent: 300
		// child: 200 두줄을 찍어냄 childMethod()에서 super.parentMethod();를 넣어놔서 
		// parentMethod();도 한번 부른다음에 실행해서
		child.childMethod();
	}

}
