package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.Practice1();
		
	}
	public void Practice1() {
		// ArrayList 생성 및 요소 추가
		ArrayList<String> tp = new ArrayList<>();
		tp.add("택시");
		tp.add("버스");
		tp.add("지하철");
		
		// Iterator 생성
		Iterator<String> iter = tp.iterator();
		
		// Iterator을 사용하여 요소 반복
		while(iter.hasNext()) {
			String trans = iter.next();
			System.out.println(trans);
		}
		
		// Iterator을 사용하여 요소 삭제
		iter = tp.iterator();
		while (iter.hasNext()) {
			String trans = iter.next();
				
			// 만약 smoke가 들어오면 삭제하길 원함
			if (trans.equals("택시")) {
				iter.remove();
			}
			System.out.println(trans);
		}
		// 삭제 후 ArrayList 출력
		System.out.println("삭제 후 출력");
		for (String a : tp) {
			System.out.println(a);
		}
	}
}
