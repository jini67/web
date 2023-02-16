package 상속;

public class 원더우먼 extends 우먼{
	boolean fly;
	
	public void space() {
		sleep();
		System.out.println("이름은 " + name);
		System.out.println("악당을 때리다.");
	}
	
	@Override
	public void eat() {
		System.out.println("근육이 많다!");
	}

	@Override
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
}