package ch11;

public class Ex13_Math {

	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-5));	//절대값
		System.out.println(Math.abs(-5.3));
		System.out.println();
		
		System.out.println(Math.ceil(1.7));	// 올림
		System.out.println(Math.ceil(-1.3));
		
		System.out.println();
		System.out.println(Math.floor(-1.3)); //내림
		System.out.println(Math.floor(1.7));
		System.out.println();
		
		System.out.println(Math.max(-1.3, 5.4)); //max,min값찾기
		System.out.println(Math.min(2,5));
		System.out.println();
		
		System.out.println(Math.random());		// random값
		System.out.println(Math.rint(5.3));		// 반올림 실수값
		System.out.println(Math.rint(5.7));		
		System.out.println(Math.round(4.1));	// 반올림 정수값
		System.out.println(Math.round(4.7));
		
	}

}
