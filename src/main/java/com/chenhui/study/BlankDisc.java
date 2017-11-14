package com.chenhui.study;

public class BlankDisc extends CompactDisk {
	
	private String title;
	private String artist;

	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public String Play(){
		return "Playing "+ title + " by " + artist;
	}
}
