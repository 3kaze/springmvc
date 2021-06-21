package com.wzw.converter;

import com.wzw.entity.Student;
import org.springframework.core.convert.converter.Converter;

/**
 * @author wei
 * @Date 2021/6/22
 */
public class StudentConverter implements Converter<String, Student> {
    @Override
    public Student convert(String s) {
        System.out.println("转换前：" + s);
        String[] args = s.split("-");
        Student student = new Student();
        student.setId(Integer.parseInt(args[0]));
        student.setName(args[1]);
        student.setAge(Integer.parseInt(args[2]));
        System.out.println("转换后：" + student);
        return student;
    }
}
