package com.kh.finalSample;

import java.util.ArrayList;

public class MyMusic {
	public static void main(String[] args) {
		MyMusic mm = new MyMusic();
		mm.runMusic();
	}
	
	public void runMusic() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("�߶��", "����"));
		list.add(new Music("����", "�ų�"));
		// list.add("����");
		
		for (int i = 0; i <= list.size(); i++) {
			Music m = list.get(i);
			// System.out.println(list.get(i));
			System.out.println(m.getG() + ", " + m.getMood());
		}
	}
}
