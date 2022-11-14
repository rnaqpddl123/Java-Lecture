package ch11.sec04_objects;

import java.util.Objects;

public class Student {
	int sno;
	String name;
	Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		
		// Ex02_Hashmain에서 찍히는 hashCode가 달라짐 sno만 보고찍으면 Ex02_Hashmain에서 s2와 s4가 같은 값이 나오는데
		// sno와 name을 같이 찍으면 hsahCode값이 달라짐
//		return Objects.hash(sno);
		return Objects.hash(sno, name);		
	}
	
	
	
	

}
