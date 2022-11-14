package ch14_lambda;

/**
 * No arguments, no return value
 */
public class Ex01_NoArgsNoReturnMain {

	public static void main(String[] args) {
		Ex01_MyFunctionalInterface fi;

		fi = () -> {
			String str = "method call";
			System.out.println(str);
		}; // 뒤에 ;(세미콜론) 붙이는거 잊지말자
		fi.method();

		fi = () -> {
			System.out.println("method call");
		};
		fi.method();

		// 한줄짜리일때응 {} 생략가능
		fi = () -> System.out.println("method call");
		fi.method();
		
		Runnable r = () -> System.out.println("method call");
		r.run();

	}

}

class MyFunctionalInterface implements Ex01_MyFunctionalInterface {
	@Override
	public void method() {
		String str = "method call";
		System.out.println(str);	
	}
}