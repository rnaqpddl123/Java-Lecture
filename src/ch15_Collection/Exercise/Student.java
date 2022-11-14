package ch15_Collection.Exercise;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		
		return Objects.hash(studentNum);
	}

	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))
			return false;
		Student target = (Student) obj;
		return studentNum == target.studentNum;
	}


	@Override
	public String toString() {
		return studentNum + ":" + name;
	}
	
	
	
	
	

}
