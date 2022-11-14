package ch06;

public class Ex12_Car {
	
	//고유데이터
	String company;
	String model;
	String color;
	int maxSpeed;
	
	Ex12_Car() {} //기본생성자, 생략하면 컴파일러가 자동으로 만들어준다.
	Ex12_Car(String company){	
		// 초기값을 내가 만들어 줄수있음 (입력하지않으면 Null)
		this.company = company;
	}
	
	//두개를 부르면 두개를  디폴트 값으로 처리
	Ex12_Car(String company, String model){
		this(company, model, "검정색",200);
	}
	
	//3개를 부르면 1개를  디폴트 값으로 처리
		Ex12_Car(String company, String model, String color){
			this(company, model, color ,200);
		}
	
	
	// 생성자 만들기 (맨윗단에 Source -> Generate constructor using fields로 자동생성가능)
	public Ex12_Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	void printField() {
		System.out.println(this.company + ", " + this.model + ", " + 
				this.color + ", " + this.maxSpeed);
	}

	// 상단 Source --> Generate toString()
	@Override
	public String toString() {
		return "Ex12_Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
	

}
