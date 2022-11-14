package ch10.ex11userDefineException;

public class BalanceInsufficientException extends RuntimeException{
	

	BalanceInsufficientException() {
	}

	BalanceInsufficientException(String message) {
		super(message);
		System.out.println("잔고가 모자랍니다");
	}
	

}
