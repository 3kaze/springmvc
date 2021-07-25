package com.wzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wei
 * @Date 2021/7/25
 */
@RequestMapping("/inter")
@Controller
public class InterHandler {

    @GetMapping("/index")
    public String index() {
        return "inter";
    }
}
