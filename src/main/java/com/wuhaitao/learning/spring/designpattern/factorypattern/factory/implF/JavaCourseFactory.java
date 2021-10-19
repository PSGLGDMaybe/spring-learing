package com.wuhaitao.learning.spring.designpattern.factorypattern.factory.implF;

import com.wuhaitao.learning.spring.designpattern.factorypattern.factory.ICourse;
import com.wuhaitao.learning.spring.designpattern.factorypattern.factory.ICourseFactory;
import com.wuhaitao.learning.spring.designpattern.factorypattern.factory.impl.JavaCourse;

/**
 * @author wuhaitao
 * @Classname JavaCourseFactory
 * @Description TODO
 * @Date 2021/10/18 16:07
 * @Created by wuhaitao
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
