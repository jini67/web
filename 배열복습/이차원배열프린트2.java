package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"스페인","영국","캘리포니아"},
				{"LA","스위스","히말라야"},
				{"상하이","이탈리아","프랑스"}
				};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}

}
