package com.chenhui.study.wire.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chenhui.study.wire.Disk;

@Configuration
public class JCdPlayerConfig {
	
	@Bean
	public Disk jCompactDisk(){
		return new JCompactDisk() ;
	}

	@Bean
	public JCdPlayer jCdPlayer(JCompactDisk disk){
		return new JCdPlayer(disk);
	}
}
