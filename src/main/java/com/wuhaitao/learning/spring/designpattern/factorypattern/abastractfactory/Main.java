package com.wuhaitao.learning.spring.designpattern.factorypattern.abastractfactory;

/**
 * @author wuhaitao
 * @Classname Main
 * @Description TODO
 * @Date 2021/10/18 17:00
 * @Created by wuhaitao
 */
public class Main {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createNote().edit();
        pythonCourseFactory.createVideo().record();
    }
}
