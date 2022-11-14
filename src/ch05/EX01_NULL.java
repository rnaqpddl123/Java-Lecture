package ch05;

public class EX01_NULL {

	public static void main(String[] args) {
		String s = null;	// null은 참조형 변수에만 사용가능
		int[] intArray = null;
//		int a =null;	기본타입에는 사용할수없다(error뜸)
		//null이라는것은 주소는있는데 데이터값이 없다고 생각하면될듯
		
		
//		System.out.println(s.length());	//NullpointerException 
//		intArray[0] = 5;				//NullpointerException
		
		String s0 = "";
		System.out.println(s0.length());

	}

}
