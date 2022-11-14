package ch15_Collection.advanced;
/*
 * 1. id와 name으로 동일한 객체인지 판별	- hashSet
 * 2. 직급별 입사일자 순으로 정렬			- treeSet
 */

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable{
	private int id;
	private String name;
	private Position position;
	private LocalDate joinDate;
	
	Employee(int id, String name, Position position, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	public Position getPosition() {return position;}
	public LocalDate getJoinDate() {return joinDate;}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate + "]";
	}
	
	// hashCode와 equals는 중복된 데이터인지 확인
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee))
			return false;
		Employee e =(Employee) obj;				
		return id == e.getId() && name.equals(e.getName());
	}

	//직급 비교해서 같으면 입사날짜로 비교하고 다르면 직급으로 나눔
	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Employee))
			return 0;
		Employee e =(Employee) o;
		return position.equals(e.getPosition()) ? 
				joinDate.compareTo(e.getJoinDate()) : 
				position.compareTo(e.getPosition());
	}
	
	
	

}
