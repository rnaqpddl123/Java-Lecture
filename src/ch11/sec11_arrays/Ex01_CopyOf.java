package ch11.sec11_arrays;

import java.util.Arrays;

public class Ex01_CopyOf {

	public static void main(String[] args) {
		char[] src = { 'J', 'A', 'V', 'A' };

		// 방법1
		char[] dst = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(dst));

		// 방법2
		dst = Arrays.copyOfRange(dst, 1, 2);
		System.out.println(Arrays.toString(dst));

		// 방법3, 받는 배열에 기억장소가 확보되어야함
		// 방법3은 좋은방법이아님, 파라미터도 길고 복사당하는 소스에 길이도 확보되어야해서 방법1이나 2를 쓰는게좋음
		char[] newDst = new char[4];
		// System.arraycopy(복사할소스,복사할 시작지점,복사당하는소스, 복사당하는시작지점,복사할길이)
		System.arraycopy(src, 0, newDst, 0, src.length);	
		System.out.println(Arrays.toString(newDst));
		
		
		src[0] = 's';
		newDst[1] = 'a';
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(newDst));
		
	}

}
