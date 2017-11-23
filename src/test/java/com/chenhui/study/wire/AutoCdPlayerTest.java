package com.chenhui.study.wire;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chenhui.study.wire.auto.AutoCdPlayerConfig;
import com.chenhui.study.wire.auto.CdPlayer;
import com.chenhui.study.wire.java.JCdPlayer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AutoCdPlayerConfig.class)
public class AutoCdPlayerTest {
	
	@Autowired
	private Disk disk;

	@Test
	public void isDiskExist() {
		assertNotNull(disk);
	}

	@Autowired
	private CdPlayer player;
	
	@Test
	public void isPlayerExist(){
		assertNotNull(player);
		assertEquals("play by with Compact disk",player.play());
	}
}
