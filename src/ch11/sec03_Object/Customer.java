package ch11.sec03_Object;

public class Customer implements Cloneable{		//(implements Cloneable) 붙이면 clone이라는 메소드 사용가능
	String id;
	String name;
	int age;
	boolean adult;
	
	
	Customer(String id, String name, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.adult = adult;
	}
	
	
	Customer getCustomer() {
		Customer cloned = null;
		try {				//class에서 implements Cloneable 안붙이면 안될수도 있어서 이걸 붙여줌
			cloned = (Customer) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", adult=" + adult + "]";
	}
	
	

}
