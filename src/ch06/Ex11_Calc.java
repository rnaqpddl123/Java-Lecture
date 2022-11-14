package ch06;

public class Ex11_Calc {

	public static void main(String[] args) {
		Calc calc = new Calc(1.2, 5.3);
		double res = calc.add();
		System.out.println(res);
		
		System.out.println(new Calc(2.6, 4.5).add());    //보여주기용 실전에서는 이렇게 안씀
		System.out.println(new Calc(2.6, 4.5).sub());    
		System.out.println(new Calc(2.6, 4.5).mul());   
		System.out.println(new Calc(2.6, 4.5).div());    
	}

}

class Calc { // default가 생략되있음
	double x; // field
	double y;

	Calc(double x, double y) { // 생성자
		this.x = x;		//this.x는 field의 x를 말함
		this.y = y;
	}

	double add() { // method
		return this.x + this.y;
	}
	
	double sub() {
		return this.x - this.y;
	}
	
	double mul() {
		return this.x * this.y;
	}
	
	double div() {
		return this.x / this.y;
	}
}