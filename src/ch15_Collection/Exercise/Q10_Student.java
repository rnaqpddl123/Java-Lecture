package ch15_Collection.Exercise;


public class Q10_Student implements Comparable{
	public String id;
	public int score;
	
	Q10_Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Q10_Student))
			return 0;
		Q10_Student s = (Q10_Student) o;
		
		return (score == s.score) ? id.compareTo(s.id) : score - s.score ;
	}
	
	
	

}
