package com.chenhui.study.wire.java;

import com.chenhui.study.wire.Disk;
import com.chenhui.study.wire.Player;

public class JCdPlayer implements Player{
	
	private Disk disk;

	public JCdPlayer(Disk disk) {
		this.disk = disk;
	}
	
	public String play(){
		return this.disk.play();
	}
	
}
