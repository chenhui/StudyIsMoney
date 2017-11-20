package com.chenhui.study.wire;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chenhui.study.wire.Disk;
import com.chenhui.study.wire.Player;
import com.chenhui.study.wire.java.JCdPlayer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/java/com/chenhui/study/wire/xml/CdPlayer.xml")
public class XCdPlayerTest {
	
	@Autowired
	@Qualifier("xcompactDisc")
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
	
	@Autowired
	@Qualifier("blankDisc")
	private Disk blankDisk;
	
	@Test
	public void isBlankDiscExist(){
		assertNotNull(blankDisk);
		assertEquals("Playing study by chenhui",blankDisk.play());
		
	}

	@Autowired
	@Qualifier("cBlankDisc")
	private Disk cBlankDisk;
	
	@Test
	public void isCBlankDiscExist(){
		assertNotNull(cBlankDisk);
		assertEquals("Playing c study by c chenhui",cBlankDisk.play());
		
	}
	
	@Autowired
	@Qualifier("pCdPlayer")
	private Player pCdPlayer;
	
	@Test
	public void ispCdPlayerExist(){
		assertNotNull(pCdPlayer);
		assertEquals("Playing study by chenhui",pCdPlayer.play());
	}

	
	@Autowired
	@Qualifier("pPCdPlayer")
	private Player pPCdPlayer;
	
	@Test
	public void ispPCdPlayerExist(){
		assertNotNull(pPCdPlayer);
		assertEquals("Playing study by chenhui",pPCdPlayer.play());
	}

}

