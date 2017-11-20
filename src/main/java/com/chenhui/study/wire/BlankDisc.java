package com.chenhui.study.wire;

public class BlankDisc extends CompactDisk {
	
	private String title;
	private String artist;

	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public String play(){
		return "Playing "+ title + " by " + artist;
	}


}
