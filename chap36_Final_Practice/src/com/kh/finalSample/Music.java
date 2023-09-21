package com.kh.finalSample;

public class Music extends MyMusic{
	private String g;
	private String mood;
	
	public Music(String g, String mood) {
		this.g = g;
		this.mood = mood;
	}

	public String getG() {
		return g;
	}

	public String getMood() {
		return mood;
	}

}
