package dto;

public class AnswerDto {
	private int a_num;
	private int board_num;
	private String id;
	private String a_con;
	private String nick;
	public int getA_num() {
		return a_num;
	}
	public void setA_num(int a_num) {
		this.a_num = a_num;
	}
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
	public String getA_con() {
		return a_con;
	}
	public void setA_con(String a_con) {
		this.a_con = a_con;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public AnswerDto(int a_num, int board_num, String id, String a_con, String nick) {
		super();
		this.a_num = a_num;
		this.board_num = board_num;
		this.id = id;
		this.a_con = a_con;
		this.nick = nick;
	}
	public AnswerDto(int a_num, int board_num, String id, String a_con) {
		super();
		this.a_num = a_num;
		this.board_num = board_num;
		this.id = id;
		this.a_con = a_con;
	}
	
}
