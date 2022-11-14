package ch06;

public class Ex22_GetterSetter {
	private int number;
	private boolean success;
	private boolean acceptable;
	private String name;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {	// number는 100이상 1000미만
		if (number >=100 && number<1000) {	//
			this.number = number;
			success = true;
			return;
		}
		success = false;
	}
	public boolean isSuccess() {	//number가 수정되면 true를 안되면 false를 리턴
		return success;
	}
	// setter를 밖에서 쓰지않으면 안만들어도 됨, 여기 안에서만 쓰면 안만들어도됨
//	public void setSuccess(boolean success) {
//		this.success = success;
//	}
	public boolean isAcceptable() {	// boolean인 경우에는 get이 아닌 is로 시작함
		return acceptable;
	}
	public void setAcceptable(boolean acceptable) {
		this.acceptable = acceptable;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 부모로부터 상속받은것들을 재정의하는게 override
	@Override
	public String toString() {
		return "Ex22_GetterSetter [number=" + number + ", success=" + success + ", acceptable=" + acceptable + ", name="
				+ name + "]";
	}
	
	

}
