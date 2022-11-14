package ch08;
/**
 * MySQL Data Access Object
 * MySQL과 Oracle DB같은 서로 다른 db를 사용할때 같은 인터페이스를사용
 */

public class Q04_MySqlDao implements Q04_DataAccessObject{

	@Override
	public void select() {
		System.out.println("MYSQL DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MYSQL DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MYSQL DB수정");
	}

	@Override
	public void delete() {
		System.out.println("MYSQL DB에서 삭제");
	}
	

}
