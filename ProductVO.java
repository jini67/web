package 화면DB연결;

public class ProductVO {
	private String ID;
	private String NAME;
	private String CONTENT;
	private int PRICE;
	private String COMPANY;
	private String IMG;
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		ID = id;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String name) {
		NAME = name;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String content) {
		CONTENT = content;
	}
	public int getPRICE() {
		return PRICE;
	}
	public void setPRICE(int price) {
		PRICE = price;
	}
	public String getCOMPANY() {
		return COMPANY;
	}
	public void setCOMPANY(String company) {
		COMPANY = company;
	}
	public String getIMG() {
		return IMG;
	}
	public void setIMG(String img) {
		IMG = img;
	}
	
	
}
