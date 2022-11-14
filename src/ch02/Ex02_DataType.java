package ch02;

public class Ex02_DataType {
	
	public static void main(String[] args) {
		byte bMin = -128;
		byte bMax = 127;
		//byte bb = 200; //error가 뜸  왜? byte는 127까지만 표현가능해서
		
		short sMIn = -32768;
		short sMax = 32767;
		int iMin = -2147483648; //약 -21억
		int iMax = -2147483647; //약 21억
		long lvar = 10000000000L; //뒤에 반드시 L을 붙여야 long
		
	}

}
