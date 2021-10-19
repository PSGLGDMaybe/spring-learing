package com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory.impl;

import com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory.IVideo;

/**
 * @author wuhaitao
 * @Classname JavaVideo
 * @Description TODO
 * @Date 2021/10/18 16:54
 * @Created by wuhaitao
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制了java视频");
    }
}
