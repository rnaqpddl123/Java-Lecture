package ch13_generic.Exercise;

public class Q01_Swap {

	public static void main(String[] args) {
		String[] language = { "C++", "C#", "JAVA" };
		MyArrays.swap(language, 1, 2);
		for (String value : language)
			System.out.println(value);

	}
}

class MyArrays {
	public static <T> void swap(T[] t, int i, int k) {
		// swap
		T tmp = t[i];
		t[i] = t[k];
		t[k] = tmp;

	}
}
