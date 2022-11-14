package ch06;

/**
 * 몸풀기문제 product 클래스를 만들어보세요 Instance Field -int id -String name -int price
 * -String catrgory
 * 
 * 생성자 - 기본 - 모든필드사용
 * 
 * Instance Method -- getter/setter -- toString
 */
public class Ex17_Product {
	// 인스턴스 필드생성
	private int id;
	private String name;
	private int price;
	private String catrgory;

	// 기본생성자 (이건 내가 직접만들어줌)
	public Ex17_Product() {};

	// 생성자(construcor)
	public Ex17_Product(int id, String name, int price, String catrgory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.catrgory = catrgory;
	}

	// instance method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCatrgory() {
		return catrgory;
	}

	public void setCatrgory(String catrgory) {
		this.catrgory = catrgory;
	}

	@Override
	public String toString() {
		return "Ex17_product [id=" + id + ", name=" + name + ", price=" + price + ", catrgory=" + catrgory + "]";
	}

}
