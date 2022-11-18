package mysql.player;
/**
 * DTO
 */

import java.time.LocalDate;

public class DTO {
	private int backnum;
	private String name;
	private Position position;
	private LocalDate birthday;
	private int height;
	private int isDeleted;
	
	DTO(){}
	DTO(int backnum, String name, String position, String birthday, int height) {
		super();
		this.backnum = backnum;
		this.name = name;
		this.position = Position.valueOf(position);
		this.birthday = LocalDate.parse(birthday);
		this.height = height;
	}
	DTO(int backnum, String name, String position, String birthday, int height, int isDeleted) {
		super();
		this.backnum = backnum;
		this.name = name;
		this.position = Position.valueOf(position);
		this.birthday = LocalDate.parse(birthday);
		this.height = height;
		this.isDeleted = isDeleted;
	}
	public int getBacknum() {
		return backnum;
	}
	public void setBacknum(int backnum) {
		this.backnum = backnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Position getposition() {
		return position;
	}
	public void setposition(Position position) {
		this.position = position;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "백넘버: " + backnum + ", 이름: " + name + ", 포지션: " + position + ", 생일: " + birthday
				+ ", 키:" + height +"]";
	}
	
	
	
	

}
