package com.wzw.validation;

import com.wzw.entity.Student2;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author wei
 * @Date 2021/7/7
 */
public class StudentValidation implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Student2.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", null, "姓名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", null, "密码不能为空");


    }
}
