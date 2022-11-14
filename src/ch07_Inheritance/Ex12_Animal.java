package ch07_Inheritance;
/**
 * 다형성 - Animal 사례 
 */
public class Ex12_Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.catField = 3;
		
		Animal animal = cat;
		animal.animalMethod();
		Animal animal2 = new Dog();
		animal2.animalMethod();
		
		// 아래는 사용불가 
//		animal.catMethod();
		// 아래는 전부사용가능
//		cat.catMethod();
//		cat.animalMethod();
//		animal.animalMethod();
		
		// Object는 최상위 객체라서 전부 사용가능
		Object obj = new Animal();
		obj = new Cat();
		obj = new Dog();
		
	}

}

class Animal {
	int animalField;
	void animalMethod() {
		System.out.println("Animal: " + animalField);
		System.out.println("동물이 소리를 냅니다");
	}
}

class Cat extends Animal{
	int catField;
	void catMethod() {
		System.out.println("Cat: " + catField);
	}
	 //없으면 결과값이 달라짐 
	@Override
	void animalMethod() {
		System.out.println("Cat: " + animalField);
		System.out.println("야옹~~");
	}
}

class Dog extends Animal{
	int dogField;
	void dogMethod() {
		System.out.println("Dog: " + dogField);
	}
	 //없으면 결과값이 달라짐 
	@Override
	void animalMethod() {
		System.out.println("Dog: " + animalField);
		System.out.println("멍멍!!");
	}
}

