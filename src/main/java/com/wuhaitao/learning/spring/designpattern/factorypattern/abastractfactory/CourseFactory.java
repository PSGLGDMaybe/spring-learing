package com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory;

/**
 * @author wuhaitao
 * @Classname CourseFactory
 * @Description TODO
 * @Date 2021/10/18 16:47
 * @Created by wuhaitao
 */
public interface CourseFactory {
    INote createNote();

    IVideo createVideo();
}
