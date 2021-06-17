package com.wzw.controller;

import com.wzw.entity.User;
import com.wzw.entity.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author wei
 * @Date 2021/6/17
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@RequestParam("num") Integer id, @RequestParam("str") String name) {
        System.out.println("接收到请求, 参数是：id=" + id + ", name=" + name);
        return "index";
    }

    @RequestMapping("/index/{id}/{name}")
    public String restful(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        System.out.println(id + "-" + name);
        //重定向
        return "redirect:/index.jsp";
        //转发
//        return "forward:/index.jsp"; = return "index";
    }

    @RequestMapping("/cookie")
    public String getCookie(@CookieValue("JSESSIONID") String sessionId) {
        System.out.println(sessionId);
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(User user) {
        System.out.println(user);
        return user.toString();
    }

    @RequestMapping("/baseType")
    @ResponseBody
    public String baseType(int id) {
        System.out.println(id);
        return "id:" + id;
    }

    @RequestMapping("/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value = "id", required = true, defaultValue = "0") Integer id) {
        System.out.println(id);
        return "id:" + id;
    }

    @RequestMapping("/arrayType")
    @ResponseBody
    public String arrayType(String[] names) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : names) {
            stringBuffer.append(str).append(" ");
        }
        return "name：" + stringBuffer;
    }

    @RequestMapping("/listType")
    @ResponseBody
    public String listType(UserList users) {
        StringBuffer stringBuffer = new StringBuffer();
        for (User user : users.getUsers()) {
            stringBuffer.append(user).append(" ");
        }
        return "用户：" + stringBuffer;
    }

    @RequestMapping("/jsonType")
    @ResponseBody
    public User jsonType(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

}
