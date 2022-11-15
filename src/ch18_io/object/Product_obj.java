package ch18_io.object;

import java.io.Serializable;

public class Product_obj implements Serializable{
	
	private static final long serialVersionUID = -5997253851974659415L;
	private String name;
	private int price;

	Product_obj(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", price=" + price + "]";
	}
	

}
