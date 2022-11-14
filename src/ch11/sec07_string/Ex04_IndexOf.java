package ch11.sec07_string;

public class Ex04_IndexOf {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		
		int index1 = str.indexOf("프로그래밍");	// 제일 앞글자 ""프""가 "자바 프로그래밍"의 4번째라서 3이찍혀나옴
		System.out.println(index1);
		int index2 = str.indexOf("그래밍");
		System.out.println(index2);
		
		//찾고자 하는 문자열이 대상 문자열에 있는경우 리턴값은 0이상임
		if (str.indexOf("자바") >=0)
			System.out.println("자바를 포함하고 있습니다.");
		else	// 일반적으로 -1을 리턴
			System.out.println("자바를 포함하고 있지 않습니다.");

	}

}
