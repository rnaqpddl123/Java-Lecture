package ch08;

public class Q03_Main {
		
	public static void printSound(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		
	}
	//클래스 내에서 Method를 만들어줌
	private static void printSound(Q03_Soundable soundable) {
		System.out.println(soundable.sound());
	}
}

// 이렇게 만드는건 별로 좋지않다. 한줄짜리 클래스라 아래와같이 만든거고(파일이 너무많아지니까)
// 1 class당 1 file
// 1 interface당 1 file로 만들어주는게 좋음
class Cat implements Q03_Soundable{

	@Override
	public String sound() {
		return "야옹";
	}
}

class Dog implements Q03_Soundable{

	@Override
	public String sound() {
		return "멍멍";
	}
}
