package 화면DB연결;

public class BbsVO {
	private int no;
	private String TITLE;
	private String CONTENT;
	private String WRITER;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String title) {
		TITLE = title;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String content) {
		CONTENT = content;
	}
	public String getWRITER() {
		return WRITER;
	}
	public void setWRITER(String writer) {
		WRITER = writer;
	}
	
	@Override
	public String toString() {
		return "BbsVO [no=" + no + ", TITLE=" + TITLE + ", CONTENT=" + CONTENT + ", WRITER=" + WRITER + "]";
	}
	
	
	
	
	
}
