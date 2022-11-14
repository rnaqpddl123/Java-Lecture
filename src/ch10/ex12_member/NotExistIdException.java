package ch10.ex12_member;
/**
 *  아이디가 틀렸을때
 */

public class NotExistIdException extends RuntimeException{
	NotExistIdException() {}

	NotExistIdException(String message) {
		super(message);
	};
	
}
