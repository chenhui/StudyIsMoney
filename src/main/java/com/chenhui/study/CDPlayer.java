package com.chenhui.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements Player {

	private CompactDisk disk;
	
	@Autowired
	public CDPlayer(CompactDisk disk) {
		this.disk = disk;
	}

	/* (non-Javadoc)
	 * @see com.chenhui.study.Player#play()
	 */
	@Override
	public String play() {
		return this.disk.play();
	}

}
