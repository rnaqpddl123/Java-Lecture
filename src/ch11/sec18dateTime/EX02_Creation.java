package ch11.sec18dateTime;

import java.time.Instant;
//import java.time.*;	// 아래 임폴트되있는거 전부포함
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class EX02_Creation {

	public static void main(String[] args) throws InterruptedException {
		// 날짜
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate examDay = LocalDate.of(2022, 11, 17);
		System.out.println(examDay);
		
		// 시간
		LocalTime curTime = LocalTime.now();
		System.out.println(curTime);
		LocalTime lunchTime = LocalTime.of(11,50);		//(11,50,0,0,0) --> 뒤에 다른 값 추가로 넣어도 정상작동
		System.out.println(lunchTime);
		
		// 날짜 + 시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalDateTime christmas = LocalDateTime.of(2022,12,25,0,0);
		System.out.println(christmas);
		
		// Timezone
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));			//영국시간
		System.out.println(utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));	//한국시간
		System.out.println(seoulDateTime);
		
		// Timestamp
		Instant is1 =Instant.now();
		Thread.sleep(10);
		Instant is2 =Instant.now();
		System.out.println(is1.until(is2, ChronoUnit.NANOS));
		System.out.println(is1.isBefore(is2));	// is1이 빠르니까 true
		System.out.println(is1.isAfter(is2));	// is1이 느리니까 false
		

		
	}

}
