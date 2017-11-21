package com.chenhui.study.wire.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chenhui.study.wire.Disk;
import com.chenhui.study.wire.java.JCompactDisk;

@Configuration
public class SepCdConfig {
	
	@Bean
	public Disk jCompactDisk(){
		return new JCompactDisk() ;
	}
}