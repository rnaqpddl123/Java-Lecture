package ch10;

public class Ex05_TryCatch {

	public static void main(String[] args) {
		String data1 =null;
		String data2 =null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {		
			// catch(Exception e)를 적는게 일반적임 
			// catch(ArrayIndexOutOfBoundsException e) 를 적으면 해당 Exception밖에 못잡아내고
			// catch(Exception e)는 모든 Exception을 잡아냄(Exception은 모든 Exception의 부모이기때문에 )
			
			System.out.println("매개변수가 부족합니다.");
			System.out.println("사용법 : 매개변수로 값 2개를 적으세요");
		} finally {
			System.out.println("첫번째 트라이의 fianlly입니다.");
		}
		
		
		int value1=0, value2=0;
		try {
			value1 = Integer.parseInt(data1);
			value2 = Integer.parseInt(data2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("잘못된 숫자입니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}
		System.out.println("value1: " +value1+"  value2: "+value2);

	}

}
