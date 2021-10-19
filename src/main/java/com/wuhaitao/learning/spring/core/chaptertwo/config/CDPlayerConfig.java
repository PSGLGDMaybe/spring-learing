package com.wuhaitao.learning.spring.core.chaptertwo.config;

import com.wuhaitao.learning.spring.core.chaptertwo.entity.CompactDisc;
import com.wuhaitao.learning.spring.core.chaptertwo.entity.SgtPappers;
import com.wuhaitao.learning.spring.core.chaptertwo.two_2.model.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuhaitao
 * @Classname CDPlayerConfig
 * @Description TODO
 * @Date 2021/9/14 10:17
 * @Created by wuhaitao
 */
//@ComponentScan(basePackages = "com.wuhaitao.learning.spring.core.chaptertwo")
@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPappers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
}
