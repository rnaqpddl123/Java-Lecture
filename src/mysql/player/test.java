package mysql.player;

public class test {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		DTO dto = new DTO(1, "임찬규", "투수","1992-11-20", 185);
		dao.insertPlayer(dto);
		

	}

}
