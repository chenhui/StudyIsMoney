package com.chenhui.study;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JCdPlayerConfig.class)
public class JCDPlayerTest {
	
	@Autowired
	private Disk disk;

	@Test
	public void isDiskExist() {
		assertNotNull(disk);
	}

	@Autowired
	private JCdPlayer player;
	
	@Test
	public void isPlayerExist(){
		assertNotNull(player);
		assertEquals("play by with JCompact disk",player.play());
	}
}
