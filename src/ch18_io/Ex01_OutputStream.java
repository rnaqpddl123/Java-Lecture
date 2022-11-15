package ch18_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_OutputStream {

	public static void main(String[] args) {

		try {
			//파일 오픈	(c드라이브 temp폴더의test.db파일 생성및오픈)
			OutputStream os = new FileOutputStream("/temp/test.db");
			
			byte a = 10, b = 20;		
			int c= 30;		// integer로 선언해도 실제로는 1바이트만 써진다.
			//파일에 데이터 입력
			os.write(a);	//1바이트
			os.write(b);	//1바이트
			os.write(c);	//1바이트
			
			byte[] array = {10,20,30,40,50};	
			os.write(array);				//5바이트
			os.write(array, 1, 3 );			//3바이트
					
			os.flush();	// buffer에 있는 데이터 i/o에 저장시키기(좀더 알아보자)
			os.close();	// 파일 닫기
		} catch (IOException e) {
			e.printStackTrace();
		} //finally를 하는게 맞지만 여기서는 통상적으로 finally를 안함
		
	}

}
