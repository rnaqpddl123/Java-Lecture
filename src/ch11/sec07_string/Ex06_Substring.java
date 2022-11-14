package ch11.sec07_string;

public class Ex06_Substring {

	public static void main(String[] args) {
		String ssn = "880823-1234567";
		
		String firstPart = ssn.substring(0,6);	// 0~5까지 (6은 미포함)
		System.out.println(firstPart);
		
		String secondPart = ssn.substring(7);	// 7이후로 출력
		System.out.println(secondPart);
		
		//ssn에서 생년월일을 YYYY-MM-DD형태로 표시
		String month = ssn.substring(2,4);
		String day = ssn.substring(4,6);
		char gender = ssn.charAt(7);
		String year = ssn.substring(0,2);
		
		if (gender == '1' || gender == '2')
			year = "19" + year;
		else
			year = "20" + year;
		System.out.println("생년월일: " + year + "-" + month + "-" + day);
	}

}
