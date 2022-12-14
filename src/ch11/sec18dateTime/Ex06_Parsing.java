package ch11.sec18dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex06_Parsing {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.parse("2022-11-04");
		System.out.println(localDate);

//		localDate = LocalDate.parse("2022.11.04");	//format을 잘못잡아서 Exception뜸
//		System.out.println(localDate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2022.11.04", formatter);
		System.out.println(localDate);
				
		formatter = DateTimeFormatter.ofPattern("yy/MM/dd");
		localDate = LocalDate.parse("22/11/04", formatter);
		System.out.println(localDate);
	}

}
