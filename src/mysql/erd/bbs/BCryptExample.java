package mysql.erd.bbs;
/**
 * 비밀번호 해쉬화(암호화)
 * $2a : bcrypt version정보
 * $10 : 라운드 정보 (bcrypt와 관련던정보)
 */
import org.mindrot.jbcrypt.BCrypt;

public class BCryptExample {

	public static void main(String[] args) {
		String pwd = "1234asdf";
		String crypredPwd = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(crypredPwd.length());
		System.out.println(crypredPwd);
		
		// 동일한 비밀번호도 BCrypt.gensalt()때문에 결과가 달라진다.(길이는60으로 동일)
		String crypredPwd2 = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(crypredPwd2.length());
		System.out.println(crypredPwd2);
		System.out.println();
		
		String salt = BCrypt.gensalt();
		System.out.println(salt.length());
		System.out.println(salt);
		
		// salt = BCrypt.gensalt(); 로 암호화 하는방법을 고정하면 아래처럼됨
		// salt라는 고정값을주면 결과가 같아진다
		// salt 값이 동일하면 만들어진 비문이 동일함
		System.out.println(BCrypt.hashpw(pwd, salt));
		System.out.println(BCrypt.hashpw(pwd, salt));
		
		// 패스워드가 동일한지 확인
		// 내가 입력한 패스워드와 암호화된 비밀번호가 같은지 확인 (같다)
		boolean result = BCrypt.checkpw(pwd, crypredPwd);
		System.out.println(result);
	}

}
