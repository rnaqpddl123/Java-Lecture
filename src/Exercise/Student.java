package Exercise;

public class Student {
	private String studentNum;
	

	Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		int hashcode = studentNum.hashCode();	
		return hashcode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student studentKey = (Student) obj;
			if (studentNum.equals(studentKey.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
