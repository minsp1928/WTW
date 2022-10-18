package dto;

import java.util.Date;

public class BoardBto {
	private int board_num;
	private String id;
	private String nick;
	private String b_title;
	private String b_con;
	private int b_category;
	private Date b_time;
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_con() {
		return b_con;
	}
	public void setB_con(String b_con) {
		this.b_con = b_con;
	}
	public int getB_category() {
		return b_category;
	}
	public void setB_category(int b_category) {
		this.b_category = b_category;
	}
	public Date getB_time() {
		return b_time;
	}
	public void setB_time(Date b_time) {
		this.b_time = b_time;
	}
	public BoardBto(int board_num, String id, String nick, String b_title, String b_con, int b_category, Date b_time) {
		super();
		this.board_num = board_num;
		this.id = id;
		this.nick = nick;
		this.b_title = b_title;
		this.b_con = b_con;
		this.b_category = b_category;
		this.b_time = b_time;
	}
	
}
