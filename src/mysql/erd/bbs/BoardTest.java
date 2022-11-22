package mysql.erd.bbs;

import java.util.List;

public class BoardTest {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		dao.incrementViewCount(3);
		int count = dao.getCount();
		System.out.println(count);
		
		List<Board> list = dao.listBoard();
		for (Board b :list)
			System.out.println(b);
		
		List<Bbs> bbslist = dao.getBbsList(0);
		for (Bbs b : bbslist)
			System.out.println(b);

	}

}
