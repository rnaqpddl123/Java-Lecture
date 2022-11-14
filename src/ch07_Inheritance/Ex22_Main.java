package ch07_Inheritance;

public class Ex22_Main {

	public static void main(String[] args) {
		Cow cow = new Cow();
		Cock cock = new Cock();
		cow.sound();
		cock.sound();
		System.out.println();
		
		// 자동 타입 변환
//		Ex22_Animal animal = new Ex22_Animal(); // 추상클래스는 객체로안된다 
		Ex22_Animal animal = null;
		animal = new Cow();
		animal.sound();
		animal = new Cock();
		animal.sound();
		System.out.println();
		
		// 매개변수의 자동 타입 변환
		animalSound(new Cow());
		animalSound(new Cock());
	}
	static void animalSound(Ex22_Animal animal) {
		animal.sound();
	}

}
