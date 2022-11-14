package ch06;

public class Ex31_Account {
	private int balance;
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	
	public int getBalance() {
		return balance;
	}
	

	
	public void setBalance(int balance) {
		// 문제풀이
//		if (balance>=MIN_BALANCE && balance<=MAX_BALANCE )
//			this.balance = balance;
		// 내 total Account가 MIN보다 크고 MAX보다 작을때
		if ((this.balance + balance)>=MIN_BALANCE && (this.balance+ balance)<=MAX_BALANCE )
			this.balance += balance;
	}
		
}
