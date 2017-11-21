package com.chenhui.study.wire.mix;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SepCdPlayerConfig.class,SepCdConfig.class})
public class SoundSystemConfig {

}
