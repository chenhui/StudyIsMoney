package com.chenhui.study.wire.mix.xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(MXCdPlayerConfig.class)
@ImportResource("file:src/main/java/com/chenhui/study/wire/mix/xml/MxCdConfig.xml")
public class MXSoundSystemConfig {

}
