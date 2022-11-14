package ch08;

public class Ex03_Main {

	public static void main(String[] args) {
		Ex03_SmartTV smartTV = new Ex03_SmartTV();
		smartTV.turnOn();
		smartTV.search("Naver");
		smartTV.setVolume(4);
		smartTV.turnOff();
		System.out.println();
		
		// 인터페이스 구현 객체의 다형성
		Ex01_RemoteControllable rc = new Ex03_SmartTV();
		rc.turnOn();
//		rc.search("Google");		// 이거는 안됨 왜냐면 Ex01_RemoteControllable에없고 Ex03_SmartTV에만 있어서
		rc.setVolume(5);
		rc.turnOff();
		System.out.println();
		
		Ex03_Searchable sc = new Ex03_SmartTV();
//		sc.turnOn();			//여기서는 이게안됨 왜냐면 Ex01_RemoteControllable에만 있어서
		sc.search("Google");
	}

}
