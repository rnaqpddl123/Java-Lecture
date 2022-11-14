package ch11.sec18dateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex01_Calendar {

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");
		Calendar now = Calendar.getInstance(tz);
		System.out.println(now);

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // month는 +1 증가시켜줘야함
		int day = now.get(Calendar.DAY_OF_MONTH);

		System.out.println(year + "-" + month + "-" + day);

		int week = now.get(Calendar.DAY_OF_WEEK);
//		System.out.println(week);

		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break; // 2
		case Calendar.TUESDAY:
			strWeek = "화";
			break; // 3
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break; // 4
		case Calendar.THURSDAY:
			strWeek = "목";
			break; // 5
		case Calendar.FRIDAY:
			strWeek = "금";
			break; // 6
		case Calendar.SATURDAY:
			strWeek = "토";
			break; // 7
		default:
			strWeek = "일";
			break; // 1
		}
		System.out.println(strWeek);

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = (amPm == Calendar.AM) ? "오전" : "오후";

		int hour = now.get(Calendar.HOUR);
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(strAmPm + " " + hour + ":" + minute + ":" + second);
		System.out.println(hour24 + ":" + minute + ":" + second);
	}

}
