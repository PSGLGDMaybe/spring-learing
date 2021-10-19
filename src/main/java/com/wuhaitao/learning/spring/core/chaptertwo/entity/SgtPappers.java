package com.wuhaitao.learning.spring.core.chaptertwo.entity;

import org.springframework.stereotype.Component;

/**
 * @author wuhaitao
 * @Classname SgtPappers
 * @Description TODO
 * @Date 2021/9/14 10:19
 * @Created by wuhaitao
 */
@Component
public class SgtPappers implements CompactDisc{
    @Override
    public void paly() {
        System.out.println("SgtPappers");
    }
}
