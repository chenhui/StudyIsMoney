package com.chenhui.study.wire;

import org.springframework.stereotype.Component;

@Component
public class CompactDisk implements Disk {
	public String play() {
		return "play by with Compact disk";
	}
}
