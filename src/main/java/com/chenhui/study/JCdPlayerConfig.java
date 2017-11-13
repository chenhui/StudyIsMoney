package com.chenhui.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
