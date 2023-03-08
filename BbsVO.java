package 화면DB연결;

public class BbsVO {
	private String no;
	private String TITLE;
	private String CONTENT;
	private String WRITER;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	public String getWRITER() {
		return WRITER;
	}
	public void setWRITER(String wRITER) {
		WRITER = wRITER;
	}
	
	@Override
	public String toString() {
		return "BbsVO [no=" + no + ", TITLE=" + TITLE + ", CONTENT=" + CONTENT + ", WRITER=" + WRITER + "]";
	}
	
	
	
}
