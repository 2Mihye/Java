package com.kh.finalSample;

import java.util.ArrayList;

public class MyMusic {
	public void runMusic() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("¹ß¶óµå", "½½ÇÄ"));
		list.add(new Music("´í½º", "½Å³²"));
		// list.add("À½¾Ç");
		
		for (int i = 0; i <= list.size(); i++) {
			Music m = list.get(i);
			// System.out.println(list.get(i));
			System.out.println(m.getG() + ", " + m.getMood());
		}
	}
}
