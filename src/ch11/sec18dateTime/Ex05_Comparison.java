package ch11.sec18dateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex05_Comparison {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2022, 11, 4, 9,0);
		System.out.println(startDateTime);
		LocalDateTime endDateTime = LocalDateTime.of(2023, 3, 8, 18,0);
		System.out.println(endDateTime);
		
		System.out.println(startDateTime.isBefore(endDateTime));
		System.out.println(startDateTime.isAfter(endDateTime));
		
		System.out.println(startDateTime.until(endDateTime, ChronoUnit.DAYS));	//startDateTime부터 endDateTime까지 몇일남았는지 보여줌 
		
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.println(period.getYears());	// 몇년남았는지
		System.out.println(period.getMonths());	// 몇달남았는지
		System.out.println(period.getDays());	// 몇일남았는지
		
		// Period는 날짜기준클래스, Duration은 시간기준 클래스이다.
		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println(duration.getSeconds());
	}

}
