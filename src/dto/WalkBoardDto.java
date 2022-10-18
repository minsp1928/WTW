package dto;

import java.sql.Date;

public class WalkBoardDto {
	private int walk_Num;		// 게시판 번호 
	private String id;			// 작성자 id
	private String nick;		// 작성자 닉네임
	private String title;		// 제목
	private String comment;		// 본문내용 
	private Date start_Time;	// 시작시간 
	private String addr;		// 위치 
	private String total;		// 참가자 
	private String wb_Time;		// 업로드 시간
	
	
	
	
	@Override
	public String toString() {
		return "WalkBoardDto [walk_Num=" + walk_Num + ", id=" + id + ", nick=" + nick + ", title=" + title
				+ ", comment=" + comment + ", start_Time=" + start_Time + ", addr=" + addr + ", total=" + total
				+ ", wb_Time=" + wb_Time + "]";
	}
	
	public WalkBoardDto(int walk_Num, String id, String nick, String title, String comment, Date start_Time,
			String addr, String total, String wb_Time) {
		super();
		this.walk_Num = walk_Num;
		this.id = id;
		this.nick = nick;
		this.title = title;
		this.comment = comment;
		this.start_Time = start_Time;
		this.addr = addr;
		this.total = total;
		this.wb_Time = wb_Time;
	}
	
	

	public WalkBoardDto(String id, String nick, String title, String comment, Date start_Time, String addr) {
		super();
		this.id = id;
		this.nick = nick;
		this.title = title;
		this.comment = comment;
		this.start_Time = start_Time;
		this.addr = addr;
	}

	public int getWalk_Num() {
		return walk_Num;
	}
	public void setWalk_Num(int walk_Num) {
		this.walk_Num = walk_Num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getStart_Time() {
		return start_Time;
	}
	public void setStart_Time(Date start_Time) {
		this.start_Time = start_Time;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getWb_Time() {
		return wb_Time;
	}
	public void setWb_Time(String wb_Time) {
		this.wb_Time = wb_Time;
	}
	
	
	

}
