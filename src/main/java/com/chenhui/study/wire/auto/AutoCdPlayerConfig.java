package com.chenhui.study.wire.auto;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chenhui.study.wire.auto.CompactDisk;

@Configuration
@ComponentScan(basePackageClasses={CompactDisk.class,CdPlayer.class})

public class AutoCdPlayerConfig {
	
}
