package com.wuhaitao.learning.spring.designpattern.factorypattern.simple.impl;

import com.wuhaitao.learning.spring.designpattern.factorypattern.simple.ICourse;

/**
 * @author wuhaitao
 * @Classname JavaCourse
 * @Description TODO
 * @Date 2021/10/18 15:19
 * @Created by wuhaitao
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制了java课程");
    }
}
