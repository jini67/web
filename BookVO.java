package 도서시스템_12조;

//RAM에 저장공간을 만든다.
public class BookVO {
	// MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜줌.
	private String TITLE;
	private String CONTENT;
	private String PRICE;
	private String WRITER;
	
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
	public String getPRICE() {
		return PRICE;
	}
	public void setPRICE(String price) {
		PRICE = price;
	}
	public String getWRITER() {
		return WRITER;
	}
	public void setWRITER(String writer) {
		WRITER = writer;
	}
	
	@Override
	public String toString() {
		return "BookVO [TITLE=" + TITLE + ", CONTENT=" + CONTENT + ", PRICE=" + PRICE + ", WRITER=" + WRITER + "]";
	}
	
	
	
	
	
}
