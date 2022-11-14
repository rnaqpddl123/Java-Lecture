package ch11.sec03_Object;

public class Ex03_CloneMain {

	public static void main(String[] args) {
	
		Customer original = new Customer("hong", "홍길동", 25, true);
		
		// 이건 얕은 복제, 깊은복제는 일단 스킵
		Customer cloned = original.getCustomer();
		cloned.age = 30;
		cloned.name = "홍자바";
		
		System.out.println(original);
		System.out.println(cloned);
		
		
		

	}

}
