package com.chenhui.study.wire.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chenhui.study.wire.Player;

@Component
public class CdPlayer implements Player {

	private CompactDisk disk;
	
	@Autowired
	public CdPlayer(CompactDisk disk) {
		this.disk = disk;
	}

	@Override
	public String play() {
		return this.disk.play();
	}

}
