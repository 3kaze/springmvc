package com.wzw.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wei
 * @Date 2021/6/19
 */
public class DateConverter implements Converter<String, Date> {

    private String pattern;

    public DateConverter(String pattern) {
        super();
        this.pattern = pattern;
    }

    @Override
    public Date convert(String s) {
        System.out.println("时间转化方法执行了");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.pattern);
        try {
            System.out.println("转化完成");
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
//            e.printStackTrace();
            throw new IllegalAccessError("日期转换出错！！");
        }
    }
}
