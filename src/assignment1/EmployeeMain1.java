package assignment1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class EmployeeMain1 {

	public static void main(String[] args) {
		Set<Employee1> hs = new HashSet<>();
		
		hs.add(new Employee1(133, "강자바", "부장", LocalDate.of(2000, 8, 1)));
		hs.add(new Employee1(143, "은전기", "차장", LocalDate.of(2003, 1, 1)));
		hs.add(new Employee1(163, "노전자", "과장", LocalDate.of(2018, 8, 1)));
		hs.add(new Employee1(173, "권표준", "대장", LocalDate.of(2022, 1, 1)));
		hs.add(new Employee1(213, "홍정부", "사원", LocalDate.of(2019, 1, 1)));
		
		for (Employee1 e : hs)
			System.out.println(e);
		System.out.println();
		
		hs.add(new Employee1(123, "김자바", "부장", LocalDate.of(1998, 1, 1)));
		hs.add(new Employee1(163, "노전자", "사원", LocalDate.of(2008, 8, 1)));
		
		for (Employee1 e : hs)
			System.out.println(e);
		System.out.println();
		
    
		



	}

}
