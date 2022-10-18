package dto;

public class MessageDto {
	
	private int m_num;		//메시지번호
	private String m_get_id;//	받는사람아이디
	private String m_send_id;//	보는사람아이디
	private String m_title;	//	쪽지제목
	private String m_con;	//	쪽지내용
	private String m_status;//	쪽지상태
	private String m_cate;	//	쪽지보낸사람분류
	
	public MessageDto(int m_num, String m_get_id, String m_send_id, String m_title, String m_con, String m_status,
			String m_cate) {
		super();
		this.m_num = m_num;
		this.m_get_id = m_get_id;
		this.m_send_id = m_send_id;
		this.m_title = m_title;
		this.m_con = m_con;
		this.m_status = m_status;
		this.m_cate = m_cate;
	}

	public int getM_num() {
		return m_num;
	}

	public String getM_get_id() {
		return m_get_id;
	}

	public String getM_send_id() {
		return m_send_id;
	}

	public String getM_title() {
		return m_title;
	}

	public String getM_con() {
		return m_con;
	}

	public String getM_status() {
		return m_status;
	}

	public String getM_cate() {
		return m_cate;
	}

	public MessageDto setM_num(int m_num) {
		this.m_num = m_num;
		return this;
	}

	public MessageDto setM_get_id(String m_get_id) {
		this.m_get_id = m_get_id;
		return this;
	}

	public MessageDto setM_send_id(String m_send_id) {
		this.m_send_id = m_send_id;
		return this;
	}

	public MessageDto setM_title(String m_title) {
		this.m_title = m_title;
		return this;
	}

	public MessageDto setM_con(String m_con) {
		this.m_con = m_con;
		return this;
	}

	public void setM_status(String m_status) {
		this.m_status = m_status;
	}

	public void setM_cate(String m_cate) {
		this.m_cate = m_cate;
	}
	
	
	
	
	
}
