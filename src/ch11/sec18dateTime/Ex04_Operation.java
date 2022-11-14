package ch11.sec18dateTime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ex04_Operation {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime target = now		//method chaining --> now.plusYears(3).minusMonths(8).~~.~.... 방식
				.plusYears(3)
				.minusMonths(8)
				.minusDays(3)
				.minusHours(2)
				.plusMinutes(10);
		System.out.println(target);
		
		//상대 변경
		target = now.with(TemporalAdjusters.lastDayOfMonth());	// 이달의 마지막날짜
		System.out.println(target);
		target = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));	// 돌아오는(다음주) 월요일
		System.out.println(target);
		target = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));	//이번달 첫번쨰 일요일
		System.out.println(target);

	}

}
