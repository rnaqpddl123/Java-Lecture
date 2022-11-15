package ch18_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Grep 찾을 문자열 (대소문자 구분없음) 찾을 파일
 */

public class Q09_GrepTeacher {

	public static void main(String[] args) throws Exception {
		grep("line", "/temp/Q09_GrepTeacher.java");

	}
	
	public static void grep(String word, String filepath) throws Exception {
		FileReader fr;
		try {
			fr = new FileReader(filepath);
			BufferedReader br = new BufferedReader(fr);
			int lineNo =0;
			while(true) {
				String rowData = br.readLine();
				if (rowData == null)
					break;
				lineNo++;
				String lineData = rowData.toLowerCase();
				if (lineData.indexOf(word) >=0) 
					System.out.printf("%3d: %s%n", lineNo, rowData);
			}
			br.close(); fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
