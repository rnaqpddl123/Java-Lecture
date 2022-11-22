package mysql.erd;

import java.time.LocalDateTime;

public class Board {
	private int bid;
	private String btitle;
	private String bcontent;
	private String uid;
	private LocalDateTime modTime;
	private int viewCount;
	private int replyCount;
	
	Board(){}
	Board(String btitle, String bcontent, String uid) {
		super();
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.uid = uid;
	}
	Board(int bid, String btitle, String bcontent, String uid, LocalDateTime modTime, int viewCount, int replyCount) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.uid = uid;
		this.modTime = modTime;
		this.viewCount = viewCount;
		this.replyCount = replyCount;
	}
	
	@Override
	public String toString() {
		return "Board [" + bid + btitle + bcontent + uid + modTime.toString().substring(2,16).replace(" ", "T") + viewCount + replyCount + "]";
	}
	
	
	
	
	

}
