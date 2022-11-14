package ch11.sec07_string;

import java.io.UnsupportedEncodingException;

public class Ex03_GetBytes {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요?";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length); 	//한글 1글장당 3bytes, ?는 1bytes --> UTF-8로 encoding되어있음
		String strFromByteArray = new String(bytes1);	// 원상복구시키기
		System.out.println(strFromByteArray);	// 안녕하세요?
		System.out.println();
		
		
		byte[] bytes2 = str.getBytes("EUC-KR");	// UTF-8 -->EUC-KR로 encoding를 바꿔줌
		System.out.println(bytes2.length);		// 한글 1글자당 2bytes, ?는 1bytes
		String strFromByteArrays = new String(bytes2, "EUC-KR");	// UTF-8은 디폴트라 안적어도되지만 EUC-KR을 바꾸려면 따로 적어줘야함
		System.out.println(strFromByteArrays);	
		System.out.println();
	}

}
