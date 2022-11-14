package ch10.ex12_member;
/**
 * 비밀번호가 틀렸을때
 */

public class WrongPasswordException extends RuntimeException {
	WrongPasswordException() {}
	
	WrongPasswordException(String message) {
		super(message);
	}

}
