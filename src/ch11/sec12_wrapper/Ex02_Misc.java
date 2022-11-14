package ch11.sec12_wrapper;

public class Ex02_Misc {

	public static void main(String[] args) {
		Double d = Double.parseDouble("3.14");
		Integer i = Integer.parseInt("100");
		Integer k = Integer.parseInt("100");
		Integer s = Integer.parseInt("200");
		Integer f = Integer.parseInt("200");
		
		
		System.out.println(i == k);		// 자동 Unboxing  //-128 ~ 127까지만 사용가능
		System.out.println(s == f);		
		// == 이 아니라 .equals()를 사용하면 -128~127 보다 넓은 범위의 정수를 비교가능하다
		System.out.println(s.equals(f));	
	}

}
