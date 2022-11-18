package mysql.customer;

import java.time.LocalDate;

/**
 * DTO(Data Transfer Object)
 */

public class Customer {
	private String uid;
	private String name;
	private LocalDate regdate;
	private int isDeleted;
	
	Customer(){}
	Customer(String uid, String name) {
		this.uid = uid;
		this.name = name;
	}
	Customer(String uid, String name, LocalDate regdate, int isDeleted) {
		super();
		this.uid = uid;
		this.name = name;
		this.regdate = regdate;
		this.isDeleted = isDeleted;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getRegdate() {
		return regdate;
	}

	public void setRegdate(LocalDate regdate) {
		this.regdate = regdate;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "Customer [" + uid + ", " + name + ", " + regdate + ", " + isDeleted + "]";
	}
	
	
	

}
