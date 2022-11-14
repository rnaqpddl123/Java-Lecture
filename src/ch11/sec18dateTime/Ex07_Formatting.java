package ch11.sec18dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex07_Formatting {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
		String nowStr = now.format(dtf);
		System.out.println(nowStr);

		dtf = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a H시 m분");	// a는 오전 오후표시
		nowStr = now.format(dtf);
		System.out.println(nowStr);
	}

}
