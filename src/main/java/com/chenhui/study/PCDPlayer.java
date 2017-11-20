package com.chenhui.study;

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
