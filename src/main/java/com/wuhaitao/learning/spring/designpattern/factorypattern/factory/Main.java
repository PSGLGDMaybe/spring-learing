package com.wuhaitao.learning.spring.designpattern.factorypattern.factory;

import com.wuhaitao.learning.spring.designpattern.factorypattern.factory.implF.JavaCourseFactory;

/**
 * @author wuhaitao
 * @Classname Main
 * @Description TODO
 * @Date 2021/10/18 16:04
 * @Created by wuhaitao
 */
public class Main {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse iCourse = factory.create();
        iCourse.record();
    }
}
