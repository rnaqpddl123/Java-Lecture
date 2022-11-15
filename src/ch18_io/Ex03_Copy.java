package ch18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03_Copy {

	public static void main(String[] args) throws IOException {
		String srcFile = "/Users/JeungDoYoung/Downloads/아기고양이.jpg";	// 복사할 파일 및 위치
		String dstFile = "/Temp/cat.jpg";									// 복사된 파일 저장소및 파일이름
		
		InputStream is = new FileInputStream(srcFile);
		OutputStream os = new FileOutputStream(dstFile);
		
		byte[] data = new byte[1024];	//1024 = 1kb
		while (true) {
			int num = is.read(data);
			if (num == -1)
				break;
			os.write(data, 0, num);
//			System.out.println(num);	// 확인용 찍어보기	사진 크기가 4296바이트라 1024*4 + 200이나옴
		}
		
		os.flush();
		os.close();
		is.close();

	}

}
