package ch10.ex11MemberLogin;

public class NotExistIdException extends RuntimeException {

	public NotExistIdException() {}

	NotExistIdException(String message) {
		super(message);
	}
	
}
