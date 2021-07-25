package com.wzw.controller;

import com.wzw.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author wei
 * @Date 2021/6/19
 */
@Controller
@RequestMapping("/converter")
public class ConverterHandler {

    @RequestMapping("/date")
    @ResponseBody
    public String date(Date date) {

        System.out.println("date=" + date);
        return "success";
    }

    @RequestMapping("/student")
    @ResponseBody
    public Student student(Student student, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return student;
    }
}
