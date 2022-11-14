package ch10.ex11userDefineException;

public class Account {
	private int balance;

	public Account() {
	}

	public int getBalance() {
		return balance;
	}

	// 입금
	public void deposit(int money) {
		balance += money;
	}

	// 출금
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			// "잔고부족: " + (money - balance) + " 모자람" -> BalanceInsufficientException()에서 message에 해당함
			throw new BalanceInsufficientException("잔고부족: " + (money - balance) + " 모자람"); 
//			throw 를하면 작업이 끝남 아래 문구는 출격이되지않음
//			System.out.println("여기아래로는 출력이안되요~");
		}
		balance -= money;
	}

}
