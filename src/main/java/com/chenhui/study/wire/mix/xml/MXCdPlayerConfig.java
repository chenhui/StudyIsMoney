package com.chenhui.study.wire.mix.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chenhui.study.wire.java.JCdPlayer;
import com.chenhui.study.wire.java.JCompactDisk;


@Configuration
public class MXCdPlayerConfig {
	
	@Bean
	public JCdPlayer jCdPlayer(JCompactDisk disk){
		return new JCdPlayer(disk);
	}
	
}
