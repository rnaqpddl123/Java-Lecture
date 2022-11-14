package ch10;

public class Ex01_NullPointer {

	public static void main(String[] args) {
		String str = null;
		//아래와같이 length()를 찍을때 아래와같이 쓰지말고 if문써서 처리해라
//		System.out.println(str.length());
		if (str != null)
			System.out.println(str.length());
		else
			System.out.println("str = null입니다.");
	}

}
