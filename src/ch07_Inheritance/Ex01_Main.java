package ch07_Inheritance;

public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_Parent parent = new Ex01_Parent();
		Ex01_Child child = new Ex01_Child();
		
		parent.parentInt = 5;
		parent.parentMethod();
		
		child.childInt = 10;
		child.childMethod();
		
		// 자식이 부모가 가지고있는 필드나 메소드를 사용할수있음
		child.parentInt=20;
		child.parentMethod();
		//그렇다고 아래가 바뀌는게 아님
		parent.parentMethod();
		
		Ex01_Child child2 = new Ex01_Child(200);
		child2.parentMethod();
		
	}

}
