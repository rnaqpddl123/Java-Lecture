package ch07_Inheritance;

/**
 * 강제 타입 변환(Casting)
 */

public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_parent parent = new Ex14_parent();
		Son son = new Son();
		Daughter daughter = new Daughter();
		
		parent = son;		//	자동 타입 변환
		parent.parentMethod();
		
		parent = daughter;
		parent.parentMethod();	//name, par
		
//		/* 강제 타입변환 - 올바르지 않은 방법 */
////		daughter = parent;				//error
//		daughter = (Daughter)parent;	//강제 타입변환(Casting)
//		daughter.daughterMethod();
//		
//		
//		son = (Son)parent;		//ClassCastExceptin, 17번째 줄에서 parent = daughter을 해줘서 이런 오류가 일어남
//		son.sonMethod();
		
		
		/* 강제 타입 변환 - 올바른 방법 */
		// instanceof 이항 연산자 같은느낌
		if (parent instanceof Daughter) {	// true
			daughter = (Daughter)parent;	//강제 타입변환
			daughter.daughterMethod();
			System.out.println("딸쪽");
		}
		
		if (parent instanceof Son) {	//false, 17번째 줄에서  parent = daughte을해줘서 타입이 변환됬기때문에 안됨
			son = (Son)parent;	//강제 타입변환
			son.sonMethod();
			System.out.println("여기는 안찍힘 ㅇㅇ");
		}
		
	}

}
