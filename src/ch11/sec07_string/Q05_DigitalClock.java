package ch11.sec07_string;
/**
* 디지털 시계 
* 00:00 ~23:59
* 디지털 시계에서 3이 표시되는 시간은 몇초인가? 
* 	시간:분 문자열
* 	문자열에서 "3"이 있으면 60초 증가
*/

public class Q05_DigitalClock {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 24; i++) {
			for (int k = 0; k < 60; k++) {
//				String time = Integer.toString(i) + " : " + Integer.toString(k);	//굳이 이렇게 안해도 자동변환됨
				String time = i + ":" + k;

				if (time.indexOf("3") >= 0)
					count += 60;
			}
		}

		System.out.println("3이 들어가있는 시간은 " + count + "초 입니다");

	}

}
