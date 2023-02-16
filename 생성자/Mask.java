package 생성자;

public class Mask {
	String 색;
	int 가격;
	int 개수;
	
	public Mask(String 색, int 가격, int 개수) {
		super();
		this.색 = 색;
		this.가격 = 가격;
		this.개수 = 개수;
	}
	
	@Override
	public String toString() {
		return "Mask [색=" + 색 + ", 가격=" + 가격 + ", 개수=" + 개수 + "]";
	}
	
	
}
