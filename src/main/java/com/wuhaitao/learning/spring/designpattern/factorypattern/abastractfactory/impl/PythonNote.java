package com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory.impl;

import com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory.INote;

/**
 * @author wuhaitao
 * @Classname JavaNote
 * @Description TODO
 * @Date 2021/10/18 16:56
 * @Created by wuhaitao
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写python笔记");
    }
}
