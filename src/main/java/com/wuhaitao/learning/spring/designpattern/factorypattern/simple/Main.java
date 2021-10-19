package com.wuhaitao.learning.spring.designpattern.factorypattern.simple;

import com.wuhaitao.learning.spring.designpattern.factorypattern.simple.impl.JavaCourse;

/**
 * @author wuhaitao
 * @Classname Main
 * @Description TODO
 * @Date 2021/10/18 15:20
 * @Created by wuhaitao
 */
public class Main {

    public static void main(String[] args) {
        ICourse iCourse = new JavaCourse();
        iCourse.record();
    }
}
