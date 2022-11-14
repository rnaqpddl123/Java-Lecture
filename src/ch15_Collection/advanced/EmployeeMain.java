package ch15_Collection.advanced;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {

	public static void main(String[] args) {
		Set<Employee> ts = new TreeSet<>();
		
		ts.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
        ts.add(new Employee(133, "강자바", Position.부장, LocalDate.of(2000, 8, 1)));
        ts.add(new Employee(143, "은전자", Position.차장, LocalDate.of(2003, 1, 1)));
        ts.add(new Employee(163, "이마이", Position.차장, LocalDate.of(2009, 10, 1)));
        ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2008, 1, 1)));
        ts.add(new Employee(203, "노전자", Position.과장, LocalDate.of(2018, 8, 11)));
        ts.add(new Employee(173, "권표준", Position.대리, LocalDate.of(2022, 1, 1)));
        ts.add(new Employee(193, "유표준", Position.대리, LocalDate.of(2017, 4, 1)));
        ts.add(new Employee(183, "천디비", Position.사원, LocalDate.of(2016, 1, 1)));
        ts.add(new Employee(213, "홍정부", Position.사원, LocalDate.of(2019, 1, 1)));
        
        // TreeSet과 HashSet의 차이를 볼수있다.
        // TreeSet은 CompareTo()를 통해 add할지 안할지 판단
        // 다음 두줄 추가할시의 결과는?
        ts.add(new Employee(513, "한정부", Position.사원, LocalDate.of(2019, 1, 1)));	// 직급,입사날짜 같아서 add안된
        ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2010, 1, 1)));	// 입사날짜가 달라서 add됨
        // 직급이 높은사람이 먼저나오고 같으면 입사일자가 빠른사람이 먼저나옴
        for(Employee emp : ts) 
        	System.out.println(emp);
        System.out.println();
        
        Set<Employee> hs = new HashSet<>();
        hs.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
        hs.add(new Employee(133, "강자바", Position.부장, LocalDate.of(2000, 8, 1)));
        hs.add(new Employee(143, "은전자", Position.차장, LocalDate.of(2003, 1, 1)));
        hs.add(new Employee(163, "이마이", Position.차장, LocalDate.of(2009, 10, 1)));
        hs.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2008, 1, 1)));
        hs.add(new Employee(203, "노전자", Position.과장, LocalDate.of(2018, 8, 11)));
        hs.add(new Employee(173, "권표준", Position.대리, LocalDate.of(2022, 1, 1)));
        hs.add(new Employee(193, "유표준", Position.대리, LocalDate.of(2017, 4, 1)));
        hs.add(new Employee(183, "천디비", Position.사원, LocalDate.of(2016, 1, 1)));
        hs.add(new Employee(213, "홍정부", Position.사원, LocalDate.of(2019, 1, 1)));
        
        // TreeSet과 HashSet의 차이를 볼수있다.
        // HashSet은 equals()와 hashCode()로 정의된걸 보고 add할지 같은지 아닌지본다. 
        // 다음 두줄 추가할시의 결과는?
        hs.add(new Employee(513, "한정부", Position.사원, LocalDate.of(2019, 1, 1)));	// id와 name이 달라서 add됨
        hs.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2010, 1, 1)));	// id와 name이 같아서 add가안됨
        
        // TreeSet과 달리 기준이없어서 자기 멋대로 나옴
        for(Employee emp : hs) 
        	System.out.println(emp);
        System.out.println();
        
        
        // Stream 을 사용하면 HashSet에서도 순서도 조종할수 있음(입사 일자 기준)
        hs.stream()
        	.sorted((o1,o2) -> o1.getJoinDate().compareTo(o2.getJoinDate()))
        	.forEach(s -> System.out.println(s));
        
        

	}

}
