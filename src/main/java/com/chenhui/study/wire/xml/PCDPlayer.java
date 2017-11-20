package com.chenhui.study.wire.xml;

import com.chenhui.study.wire.CompactDisk;
import com.chenhui.study.wire.Disk;
import com.chenhui.study.wire.Player;

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
