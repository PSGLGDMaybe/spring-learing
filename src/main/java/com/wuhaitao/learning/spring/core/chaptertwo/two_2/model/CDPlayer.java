package com.wuhaitao.learning.spring.core.chaptertwo.two_2.model;

import com.wuhaitao.learning.spring.core.chaptertwo.entity.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wuhaitao
 * @Classname CDPlayer
 * @Description TODO
 * @Date 2021/9/15 11:05
 * @Created by wuhaitao
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.paly();
    }
}
