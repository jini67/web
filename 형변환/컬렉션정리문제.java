package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션정리문제 {

	public static void main(String[] args) {
		
		// 1. 중복제거!! ==> set
		HashSet trip = new HashSet();
		trip.add("미국");
		trip.add("프랑스");
		trip.add("스페인");
		trip.add("이탈리아");
		trip.add("스위스");
		
		System.out.println(trip);
		
		// 2. 키+값을 쌍으로 넣을 때!! ==> map
		HashMap map = new HashMap();
		map.put("안방", "TV");
		map.put("거실", "소파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
	
		System.out.println(map);
		System.out.println(map.get("현관"));
		map.put("거실", "책상");
		System.out.println(map);
		
		// 3. 할 일 우선순위(순서) ==> list
		ArrayList doList = new ArrayList();
		doList.add("자바공부");
		doList.add("점심");
		doList.add("자바복습");
		doList.add("자바스터디");
		doList.add("쉬기");
		
		System.out.println(doList);
		System.out.println(doList.get(0));
		System.out.println(doList.get(doList.size() - 1));
		doList.set(1, "청소");
		System.out.println(doList);
	}

}
