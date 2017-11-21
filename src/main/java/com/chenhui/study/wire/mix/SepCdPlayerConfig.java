package com.chenhui.study.wire.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.chenhui.study.wire.java.JCdPlayer;
import com.chenhui.study.wire.java.JCompactDisk;

@Configuration
@Import(MJCdConfig.class)
public class SepCdPlayerConfig {
	
	@Bean
	public JCdPlayer jCdPlayer(JCompactDisk disk){
		return new JCdPlayer(disk);
	}
}
