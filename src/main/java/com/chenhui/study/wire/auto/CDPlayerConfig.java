package com.chenhui.study.wire.auto;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chenhui.study.wire.Disk;

@Configuration
@ComponentScan(basePackageClasses={Disk.class,CDPlayer.class})

public class CDPlayerConfig {
	
}
