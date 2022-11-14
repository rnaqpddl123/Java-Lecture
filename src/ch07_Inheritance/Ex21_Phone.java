package ch07_Inheritance;

/**
 *  추상 (abstract)클래스
 */

//실제로는 아래와 같이는 쓰지는 않음. 이해를 돕기위해 쓴것(이것이자바다 7장8절 추상클래스 참고)
public abstract class Ex21_Phone {		// 추상클래스에 해당함
	//필드
	public String owner;
	//생성자
	Ex21_Phone(String owner){
		this.owner = owner;
	}
	
	//메소드
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

//추상클래스를 상속받은 클래스
class SmartPhone extends Ex21_Phone {
	SmartPhone(String owner) {		// 부모의 생성자를 가져옴
		super(owner);
	}
	
	// 자식인 SmartPhone의 메소드
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
