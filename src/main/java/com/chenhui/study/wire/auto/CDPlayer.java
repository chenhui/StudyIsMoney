package com.chenhui.study.wire.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chenhui.study.wire.CompactDisk;
import com.chenhui.study.wire.Player;

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
