package com.wzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author wei
 * @Date 2021/6/29
 */
@Controller
@RequestMapping("/file")
public class FileHandler {

    @PostMapping(value = "/upload")
    public String upload(@RequestParam("img") MultipartFile img, HttpServletRequest request) {
        if (img.getSize() > 0) {
            //存到 apache-tomcat-9.0.37\webapps\[springmvc_war][\file]
            String path = request.getSession().getServletContext().getRealPath("file");

            String fileName = img.getOriginalFilename();
            File file = new File(path, fileName);
            try {
                img.transferTo(file);
                //[http://localhost:8080/springmvc_war][/file/][bg-05.jpg] (这里的[/file/]对应文件存放的文件名)
//            request.setAttribute("src", request.getContextPath() + "/file/" + fileName);

                //[http://localhost:8080/springmvc_war][/file/][bg-05.jpg] (这里的[/file/]是@RequestMapping("/file"))
                request.setAttribute("src", fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "upload";
    }

}
