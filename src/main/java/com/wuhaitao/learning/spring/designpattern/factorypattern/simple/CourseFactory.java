package com.wuhaitao.learning.spring.designpattern.factorypattern.simple;

import com.wuhaitao.learning.spring.designpattern.factorypattern.simple.impl.JavaCourse;
import com.wuhaitao.learning.spring.designpattern.factorypattern.simple.impl.PythonCourse;

/**
 * @author wuhaitao
 * @Classname CourseFactory
 * @Description TODO
 * @Date 2021/10/18 15:23
 * @Created by wuhaitao
 */
public class CourseFactory {
    /**
     * 此种方式当拓展业务时 还需要增加相应业务的代码，不符合开闭原则
     * 所以简单优化一下，使用class反射
     * @param name
     * @return
     */
    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }

    /**
     * 使用反射方式创建，此处存在类型不匹配的问题
     * @param className
     * @return
     */
    public ICourse create1(String className) {
        if (className != null && "".equals(className)) {
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public ICourse create(Class<? extends ICourse> clazz) {
        if (clazz != null) {
            try {
                clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
