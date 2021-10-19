package com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory;

import com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory.impl.JavaNote;
import com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory.impl.JavaVideo;
import com.wuhaitao.learning.spring.designpattern.factorypattern.factory.impl.JavaCourse;

/**
 * @author wuhaitao
 * @Classname JavaCourseFactory
 * @Description TODO
 * @Date 2021/10/18 16:52
 * @Created by wuhaitao
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
