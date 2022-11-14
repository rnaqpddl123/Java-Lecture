package ch10.ex11MemberLogin;

public class WrongPasswordException extends RuntimeException {
	
	public WrongPasswordException() {}

	WrongPasswordException(String message) {
		super(message);
	}
	
}
