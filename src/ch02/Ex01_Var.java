package ch02;

public class Ex01_Var {
	//public static final int SCORE = 90; 이렇게 먼저 선언해주고 6번째줄에서 저장한 값을 가져오는 방식이 좋음
	public static void main(String[] args) {
		//int score = SCORE; 
		int score = 90; //변수선언할때 초기값부여
		int result = score * 2;
		System.out.println("score = " + score + " result = " + result);
		
		//Literal (소스코드 내에서 직적 입련된 변수의 초기값)
		int intLitenral = 30; 	//integer(2진수)
		int octal = 036;		//octar(진수)
		int hexa = 0x1E;		//hexadeclmal(16진수)
		System.out.println(intLitenral);
		System.out.println(octal);
		System.out.println(hexa);
		System.out.printf("%d, %d, %d\n", intLitenral,octal,hexa); //버전문제로 지금 안되고있음 (해결했음)
		
		int intLiteral = 30; //integer (정수형)
		double doubleLiteral = 3.141592; // float point (실수형)
		char charLiteral = 'a'; //single quote (문자, 글자 1개)
		String strLiteral = "A quick brown fox"; // 문자열
		boolean boolLiteral = true; // true, false
		System.out.println(intLiteral);
		
		if (result > 100) {
			int score1 = 30;
			System.out.println(score1);
		}
		// System.out.println(score1);  //score1 변수는 if block밖에서는 사용할수없다 (스코프룰이라고함)
	}

}
