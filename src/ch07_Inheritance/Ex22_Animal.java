package ch07_Inheritance;

public abstract class Ex22_Animal {
	String kind;
	
	public void breathe() {
		System.out.println("소리를 냅니다.");
	}
	
	public abstract void sound();
}

class Cow extends Ex22_Animal {
	//생성자
	Cow() {
		this.kind = "소";
	}
	
	@Override
	public void sound() {
		System.out.println("음머~~");
	}
}

class Cock extends Ex22_Animal {
	//생성자
	Cock() {
		this.kind = "닭";
	}
	
	@Override
	public void sound() {
		System.out.println("꼬끼오~~");
	}
}

//추상클래스를 상속받아서 추상클래스를 또만들수있다. 이때는 @Override안해도됨
abstract class Bird extends Ex22_Animal {	
	Bird() {
		this.kind = "조류";
	}
	
}
