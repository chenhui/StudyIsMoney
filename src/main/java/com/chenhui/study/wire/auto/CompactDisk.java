package com.chenhui.study.wire.auto;

import org.springframework.stereotype.Component;

import com.chenhui.study.wire.Disk;

@Component
public class CompactDisk implements Disk {
	public String play() {
		return "play by with Compact disk";
	}
}
