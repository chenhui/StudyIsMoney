package com.chenhui.study.wire.xml;

import com.chenhui.study.wire.Disk;
import com.chenhui.study.wire.Player;
import com.chenhui.study.wire.auto.CompactDisk;

public class PCDPlayer implements Player {

	private CompactDisk compactDisk;

	@Override
	public String play() {
		return compactDisk.play();
	}

	public Disk getCompactDisk() {
		return compactDisk;
	}

	public void setCompactDisk(CompactDisk compactDisk) {
		this.compactDisk = compactDisk;
	}

}
