package ch11.sec07_string;
/**
 * 숫자값을 보려하지말고, 부호만봐라 (전/후가 중요하기때문)
 */

public class Ex10_CompareTo {

	public static void main(String[] args) {
		String str1 = "Apple";
		String str2 = "Cherry";
		String str3 = "air";
		
		// compareTo는 비교가 불가능한 지점의 각 문자열의 아스키값을 기준으로 비교를 해준다.
		// 결과 값이 중요한게 아니라 음수인지 양수인지 0인지가 중요함
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str1));
		System.out.println(str1.compareToIgnoreCase(str3));
		
		String han1 = "가나다";
		String han2 = "라마바";
		System.out.println(han1.compareTo(han2));
		
		// 한글과 영어비교 영어가 먼저나오고 한글이 나중에나오니까 음수가 나오는게 맞다.(아스키코드기준)
		System.out.println(str1.compareTo(han1));
	}

}
