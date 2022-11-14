package ch11.sec04_objects;

import java.util.Comparator;


public class StudentComparator implements Comparator<Student> {		//Comparable<type> --> <>안에 타입넣어줘야함

	@Override
	public int compare(Student o1, Student o2) {
		//아래 리턴값이 -1,1,0이 중요한게아니라 음수(-)인지 양수(+)인지 0인지가 중요하다
//		if(o1.sno < o2.sno)
//			return -1;
//		else if (o1.sno == o2.sno)
//			return 0;
//		else
//			return 1;
		
		//위 작성코드와 같은것
		return Integer.compare(o1.sno, o2.sno);
	}	


}
