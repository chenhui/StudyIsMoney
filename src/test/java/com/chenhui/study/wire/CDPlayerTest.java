package com.chenhui.study.wire;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chenhui.study.wire.CompactDisk;
import com.chenhui.study.wire.auto.CDPlayer;
import com.chenhui.study.wire.auto.CDPlayerConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	
	
	@Autowired
	private CompactDisk disk;

	@Test
	public void isDiskExist() {
		assertNotNull(disk);
	}
	
	@Autowired
	private CDPlayer player;
	
	@Test
	public void isPlayerExist(){
		assertNotNull(player);
		assertEquals("play by with Compact disk",player.play());
	}
}

