package ch01; // package 속해있는 파일그룹이라고 일단생각해두면 편함 (class 묶어놓은것)

/* 
 * 처음으로 작성해보는 자바프로그램
 */

public class HelloWorld {		//class

	public static void main(String[] args) { //method
		System.out.println("HelloWorld"); //sysout작성후 ctrl + space(자동완성) 
		System.out.println("HelloWorld"); //ctrl + alt + 위/아래 화살표
		System.out.println("안녕하세요?"); //한글확인 
		
		int x = 1; //정수 변수 (기억장소를 메인장소에 갖고있는다)
		int y = x + 1;
		System.out.println("x = " + x + " y = " + y);
	}

}
