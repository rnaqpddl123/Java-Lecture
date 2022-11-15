package ch18_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q09_Grep {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/temp/exercise.txt"));
		
		int lineNo =1;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			else if( line.toLowerCase().indexOf("def") >=0)
				System.out.println(lineNo + ":\t" + line);
			lineNo++;
		}
		br.close();	
	}

}
