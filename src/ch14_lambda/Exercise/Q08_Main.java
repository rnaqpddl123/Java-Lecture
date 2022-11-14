package ch14_lambda.Exercise;

public class Q08_Main {
//	double englishAvg = avg(s -> s.getEnglishScore() );
	private static Q08_Student[] students = {
			new Q08_Student("홍길동", 90, 96),
			new Q08_Student("신용권", 95, 93)
	};
	
	
	static double avg(Q08_Function<Q08_Student> fun) {
		double sum = 0;
		for (Q08_Student student : students )
			sum += fun.apply(student);
		return sum / students.length;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println(englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println(mathAvg);
	}
	

}
