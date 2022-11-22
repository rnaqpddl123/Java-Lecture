package mysql.erd.bbs;

import java.time.LocalDateTime;

public class Bbs {
	private int bid;
	private String btitle;
	private String uname;
	private LocalDateTime modTime;
	private int viewCount;
	private int replyCount;
	Bbs(){}
	Bbs(int bid, String btitle, String uname, LocalDateTime modTime, int viewCount, int replyCount) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.uname = uname;
		this.modTime = modTime;
		this.viewCount = viewCount;
		this.replyCount = replyCount;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public LocalDateTime getModTime() {
		return modTime;
	}
	public void setModTime(LocalDateTime modTime) {
		this.modTime = modTime;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	@Override
	public String toString() {
		return "Bbs [" + bid + btitle + uname + modTime.toString().substring(2,16).replace(" ", "T")
				+ viewCount + replyCount + "]";
	}
	
	
}
