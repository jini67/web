package 인터페이스;

import java.awt.event.ActionEvent;

public interface ActionListner {
	//추상메서드, 불완전한 메서드
	//인터페이스는 추상메서드로만 정의해야함.
	public void actionPerformed(ActionEvent e);
}
