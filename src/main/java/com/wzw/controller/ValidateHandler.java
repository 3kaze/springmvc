package com.wzw.controller;

import com.wzw.entity.Account;
import com.wzw.entity.Student2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author wei
 * @Date 2021/7/12
 */
@Controller
@RequestMapping("/validate")
public class ValidateHandler {

    /**
     * 给JSP表单绑定模型对象
     * @param model
     * @return
     */
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute(new Student2());
        return "login";
    }

    /**
     * 数据校验
     * @param student
     * @param bindingResult
     * @return
     */
    @PostMapping("/login")
    public String login(@Validated Student2 student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "login";
        }
        return "success";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute(new Account());
        return "register";
    }

    @PostMapping("/register")
    public String register(@Valid Account account, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        return "success";
    }
}
