package com.wzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wei
 * @Date 2021/6/17
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("接收到请求");
        return "index";
    }
}
