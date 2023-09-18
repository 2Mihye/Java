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
		// List�� ArrayList �����ؼ�  Comparator �����ϱ�
		List<String> actor = new ArrayList<>();
		actor.add("����");
		actor.add("�ֿ��");
		actor.add("�̵���");
		actor.add("����");
		actor.add("�ǻ��");
		
		Collections.sort(actor, new User());
		for (String actors : actor) {
			System.out.println(actors);
		}

	}

}
