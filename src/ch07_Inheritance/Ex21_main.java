package ch07_Inheritance;

public class Ex21_main {

	public static void main(String[] args) {
		// 추상클래스는 객체화 할수없다.
//		Ex21_Phone phone = new Ex21_Phone("홍길동");
		
		//사용하려면 추상 클래스를 상속받은 클래스를 객체화 시켜야한다.
		SmartPhone smartPhone = new SmartPhone("홍길동");	// 가로안에 "홍길동"은 owner에 해당한다.
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOn();
	}

}
