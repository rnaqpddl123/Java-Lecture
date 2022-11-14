package ch13_generic.sec04_method;

public class Main {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);

		// 우항에 util.뒤에 <String>생략시 컴파일러가 <String>추정
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);

	}

}
