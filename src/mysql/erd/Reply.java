package mysql.erd;

import java.time.LocalDateTime;

public class Reply {
	private int rid;
	private String rcontent;
	private LocalDateTime regTime;
	private int isMine;
	private	String uid;
	private int bid;
	
	Reply(){}
	Reply(String rcontent, String uid, int bid) {
		super();
		this.rcontent = rcontent;
		this.uid = uid;
		this.bid = bid;
	}
	Reply(int rid, String rcontent, LocalDateTime regTime, int isMine, String uid, int bid) {
		super();
		this.rid = rid;
		this.rcontent = rcontent;
		this.regTime = regTime;
		this.isMine = isMine;
		this.uid = uid;
		this.bid = bid;
	}
	
	@Override
	public String toString() {
		return "Reply [" + rid +  rcontent +  regTime + isMine + uid + bid + "]";
	}
	
	
	

}
