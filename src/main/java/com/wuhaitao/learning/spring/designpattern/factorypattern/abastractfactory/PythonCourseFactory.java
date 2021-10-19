package com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory;

import com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory.impl.PythonNote;
import com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory.impl.PythonVideo;

/**
 * @author wuhaitao
 * @Classname PythonCourseFactory
 * @Description TODO
 * @Date 2021/10/18 16:52
 * @Created by wuhaitao
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
