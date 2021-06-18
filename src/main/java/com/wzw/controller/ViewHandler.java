package com.wzw.controller;

import com.wzw.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wei
 * @Date 2021/6/18
 */
@Controller
@RequestMapping("/view")
public class ViewHandler {

    @RequestMapping("/map")
    public String map(Map<String, Object> map) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        map.put("user", user);
        return "show";
    }

    @RequestMapping("/model")
    public String model(Model model) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        model.addAttribute("user", user);
        return "show";
    }

    @RequestMapping("/mav1")
    public ModelAndView modelAndView1() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setId(1);
        user.setName("张三");
        //填充业务数据
        modelAndView.addObject("user", user);
        //绑定视图信息
        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping("/mav2")
    public ModelAndView modelAndView2() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setId(1);
        user.setName("张三");
        //填充业务数据
        modelAndView.addObject("user", user);
        //绑定视图信息
        View view = new InternalResourceView("/show.jsp");
        modelAndView.setView(view);
        return modelAndView;
    }

    @RequestMapping("/mav3")
    public ModelAndView modelAndView3() {
        ModelAndView modelAndView = new ModelAndView("show");
        User user = new User();
        user.setId(1);
        user.setName("张三");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping("/mav4")
    public ModelAndView modelAndView4() {
        View view = new InternalResourceView("/show.jsp");
        ModelAndView modelAndView = new ModelAndView(view);
        User user = new User();
        user.setId(1);
        user.setName("张三");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping("/mav5")
    public ModelAndView modelAndView5() {
        Map<String, Object> map = new HashMap<>();
        User user = new User();
        user.setId(1);
        user.setName("张三");
        map.put("user", user);
        ModelAndView modelAndView = new ModelAndView("show", map);
        return modelAndView;
    }

    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        request.setAttribute("user", user);
        return "show";
    }

    @RequestMapping("/modelAttribute")
    public String modelAttribute() {
        return "show";
    }

//    装入ModelAttribute
//    @ModelAttribute
//    public User getUser() {
//        User user = new User();
//        user.setId(1);
//        user.setName("张三");
//        return user;
//    }

    //model优先级高
    @ModelAttribute
    public void getUser(Model model) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        model.addAttribute("user", user);
    }
}
