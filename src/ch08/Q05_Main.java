package ch08;

public class Q05_Main {

	public static void main(String[] args) {
		// Check처럼 클래스를 따로 만든것과의 차이는 익명 구현객체로 만든것
		// action을 구현한 객체 (class는 아님)
		// 객체를 오직 한군데에서만 사용하는 경우에 익명 구현객체로 만들기도함
		// GUI를 만들떄 어떤 이벤트들을 처리할때쓰고 실제로는 자주사용되지않고 아래와같이 클래스를 따로만드는게 일반적
		Q05_Action action = new Q05_Action() {		
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();

		
		Check check = new Check();
		check.work();
		
	}

}


class Check implements Q05_Action{

	@Override
	public void work() {
		System.out.println("되는지 실험합니다");
	}

}

