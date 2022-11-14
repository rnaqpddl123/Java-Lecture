package ch11.sec12_wrapper;

public class Ex01_BoxingUnboxing {

	public static void main(String[] args) {
		// Boxing
		Integer obj1 = Integer.valueOf(100);	// 아래 방법보다 이방법을 더많이 사용함
		Integer obj2 = new Integer("200");	//Deprecated (사라질예정) 바로 윗줄방법쓰자
		Integer obj3 = 300;		// 자동 Boxing
		
		// Unboxing
		int value1 = obj1.intValue();		// 아래와 같이  .intValue() 안해줘도됨
		int value2 = obj2;		// 자동 Unboxing
		int value3 = obj3;
		
		System.out.println(value1 + ", " + value2 + ", " + value3);
		System.out.println(obj1.toString());
	}

}
