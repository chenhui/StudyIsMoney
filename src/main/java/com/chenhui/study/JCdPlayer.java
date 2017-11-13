package com.chenhui.study;

public class JCdPlayer implements Player{
	
	private Disk disk;

	public JCdPlayer(Disk disk) {
		this.disk = disk;
	}
	
	public String play(){
		return this.disk.play();
	}
	
}
