package ch18_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Ex02_InputStream {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("/temp/test.db");
			
			// 파일읽는 방법1	(원시적방법)
//			while (true) {
//				// 쓰는거는 byte로 읽는건 Integer로
//				int data =is.read();	//1바이트를 읽어서 4바이트로 리턴(공간낭비있는데 요즘은 괜찮음)
//				if (data == -1)
//					break;
//				System.out.println(data);
//			}
			
			// 방법2
			byte[] arr = new byte[100];
			while(true) {
				int num = is.read(arr);
				if (num == -1)
					break;
			}
			System.out.println(Arrays.toString(arr));
			
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
