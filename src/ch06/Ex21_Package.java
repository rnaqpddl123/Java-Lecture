package ch06;
/**
 * java디렉토리 밑에 time디렉토리 밑에LocalDate라는 클래스를 불러옴
 */
import java.time.LocalDate;

import ch04.EX24_Diamond;

public class Ex21_Package {

	public static void main(String[] args) {
		LocalDate a =LocalDate.now();
		// Excrecise 는 githup에 올라가지 말라는 api(해당 api없어서 적용안됨)
//		Exercise ex05 = new Exercise(); 		// ch06 package
//		ch05.Exercise ex05 = new ch05.exercise(); // ch05 package, package가 달라서 앞에 해당 package를 붙여줘야함
		EX24_Diamond ex04 = new EX24_Diamond(); // import해놔서 앞에 ch04.생략가능
		
		
	}

}
