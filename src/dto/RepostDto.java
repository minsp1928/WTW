package dto;

public class RepostDto {

	private int re_num;			//신고접수번호
	private String reposter;	//신고자아이디
	private String re_id;		//피신고자아이디
	private String reason;		//신고사유
	private String re_status;	//신고처리여부
	
	
	public RepostDto(int re_num, String reposter, String re_id, String reason, String re_status) {
		super();
		this.re_num = re_num;
		this.reposter = reposter;
		this.re_id = re_id;
		this.reason = reason;
		this.re_status = re_status;
	}
	public int getRe_num() {
		return re_num;
	}
	public String getReposter() {
		return reposter;
	}
	public String getRe_id() {
		return re_id;
	}
	public String getReason() {
		return reason;
	}
	public String getRe_status() {
		return re_status;
	}
	public void setRe_num(int re_num) {
		this.re_num = re_num;
	}
	public void setReposter(String reposter) {
		this.reposter = reposter;
	}
	public void setRe_id(String re_id) {
		this.re_id = re_id;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public void setRe_status(String re_status) {
		this.re_status = re_status;
	}
	
	
	
}
