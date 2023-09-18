package com.kh.comparablePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String> {
	
	@Override
	public int compare(String actor1, String actor2) {
		if (actor1.length() == actor2.length()) {
			return 0;
		} else if (actor1.length() > actor2.length()) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// List와 ArrayList 생성해서  Comparator 정리하기
		List<String> actor = new ArrayList<>();
		actor.add("김우빈");
		actor.add("최우식");
		actor.add("이동욱");
		actor.add("원빈");
		actor.add("권상우");
		
		Collections.sort(actor, new User());
		for (String actors : actor) {
			System.out.println(actors);
		}

	}

}
