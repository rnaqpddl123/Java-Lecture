package Exercise;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 문제3) 단어의 개수
다음과 같은 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단
어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수
만큼 모두 세어야 한다.
But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain 
was born and I will give you a complete account of the system, and expound the actual teachings 
of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, 
or avoids pleasure itself, because it is pleasure, but because those who do not know how to 
pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there 
anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because 
occasionally circumstances occur in which toil and pain can procure him some great pleasure. To 
take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain 
some advantage from it? But who has any right to find fault with a man who chooses to enjoy a 
pleasure that has no annoying consequences, or one who avoids a pain that produces no 
resultant pleasure?
 * 
 * tip) 먼저 전처리부터 하기 (, ? 제거)
 */
public class Q03_CountWord {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String findWord = scan.next();
//		scan.close();
		String text = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain \r\n"
				+ "was born and I will give you a complete account of the system, and expound the actual teachings \r\n"
				+ "of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, \r\n"
				+ "or avoids pleasure itself, because it is pleasure, but because those who do not know how to \r\n"
				+ "pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there \r\n"
				+ "anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because \r\n"
				+ "occasionally circumstances occur in which toil and pain can procure him some great pleasure. To \r\n"
				+ "take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain \r\n"
				+ "some advantage from it? But who has any right to find fault with a man who chooses to enjoy a \r\n"
				+ "pleasure that has no annoying consequences, or one who avoids a pain that produces no \r\n"
				+ "resultant pleasure?";
		System.out.println(text.length());
//		String cleanText = text.replaceAll("[\\., \\?]", "");		//구둣점(. , ?) 제거
		String cleanText = text.replaceAll("[^A-za-z -]", "");	// 알파벳 대문자,소문자 띄워쓰기를 제외한것을 ""로 교체
		System.out.println(cleanText.length());
		
		String[] textArr = cleanText.split(" ");
		System.out.println("단어의 개수" + textArr.length);
		
		// 고유 단어의 개수
		HashSet<String> hs = new HashSet<>();
		for (String word : textArr) {
			hs.add(word.toLowerCase());
		}
		System.out.println("고유단어의 개수" + hs.size());
	}
	

}

//class find {
//	private String;
//	
//}