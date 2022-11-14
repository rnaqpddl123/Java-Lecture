package ch07_Inheritance;

public class Ex04_Student extends Ex04_Person {
	String major;
	
	Ex04_Student() {}
	Ex04_Student(String name, String gender, int age, String major){ // 부모클래스의 변수도 적어줘야함
		//super는 부모의 생성자니까 부모와 공통인 변수만 적어주고 자식의 변수는 따로빼서 선언
		super(name, gender, age);
		this.major = major;
	}
	
	void study() {
		System.out.println("공부를 합니다");
	}

	@Override
	public String toString() {
		return "Ex04_Student [major=" + major + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	

}
