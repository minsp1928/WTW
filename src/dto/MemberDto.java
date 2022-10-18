package dto;

public class MemberDto {
	
	private String id;
	private String pw;
	private String nick;
	private int age;
	private String gen;
	private int status;
	private int re_count;
	
	
	
	public MemberDto(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	
	
	
	public MemberDto(String id, String pw, String nick, int age, String gen) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.age = age;
		this.gen = gen;
	}




	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", pw=" + pw + ", nick=" + nick + ", age=" + age + ", gen=" + gen + ", status="
				+ status + ", re_count=" + re_count + "]";
	}

	public MemberDto(String id, String pw, String nick, int age, String gen, int status, int re_count) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.age = age;
		this.gen = gen;
		this.status = status;
		this.re_count = re_count;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getRe_count() {
		return re_count;
	}
	public void setRe_count(int re_count) {
		this.re_count = re_count;
	}
	
	

}
