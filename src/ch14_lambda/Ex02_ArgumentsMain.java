package ch14_lambda;

public class Ex02_ArgumentsMain {

	public static void main(String[] args) {
		Ex02_MyfunctionalInterface fi;

		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(3);
		
		//간결하게
		fi = x -> {System.out.println(x * x);};
		fi.method(4);

		//좀더 간결하게
		fi = x -> System.out.println(x * x);
		fi.method(5);

	}

}
