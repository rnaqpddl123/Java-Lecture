package ch02;

public class Ex03_TypeConversion {

	public static void main(String[] args) {
		// 데이터타입을 다른타입으로 변환
		byte b = 30;
		short c = 300;
		int i = b;   // 작은수 --> 큰수로 변환할때는 자동으로 변환
		i = c; //이것두가능 
		//short s = i; 이것은 불가능함 큰수->작은수로 변환이라서
		short s = (short)i; // 큰수 --> 작은수로 변환할 때는 명시적으로(확실히) 적어줘야함
		
		
		long l = i; //int --> long
		float f = l; //long --> float
		double d = f; //float --> double
		
		System.out.println("s = " + s);
		if (s >=-128 && s<=127) {
			byte bb = (byte)s;
		}
		//System.out.println("bb = " + bb);  위 조건문을 통과못해서 bb가 정의되지 않았기 때문에error가 뜸
		
		byte bb = (byte)s; // 실행할때 에러 발생 s=300인데 byte는 127까지 표현가능하기때문
		System.out.println(s); //300
		System.out.println(bb); //300이 아니라 44가 나옴  256 +44 인데 256부분이 잘려나감  
		
		//아래는 다가능함
		i = b + s;
		d = f + l;
		String str = "str"+ d;
		
		
		// byte -> short -> int -> long -> float -> double -> string순으로 자동변환가능
	}

}
