package com.chenhui.study.wire;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chenhui.study.wire.java.JCdPlayer;
import com.chenhui.study.wire.mix.xml.MXSoundSystemConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MXSoundSystemConfig.class)
public class MixXmlCdPlayerTest {
	
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
