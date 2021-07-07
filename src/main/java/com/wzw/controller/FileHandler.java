package com.wzw.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

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

    @PostMapping("/uploads")
    public String uploads(@RequestParam("imgs") MultipartFile[] imgs, HttpServletRequest request) {
        List<String> pathList = new ArrayList<>();
        for (MultipartFile img : imgs) {
            if (img.getSize() > 0) {
                String path = request.getSession().getServletContext().getRealPath("file");
                String fileName = img.getOriginalFilename();
                File file = new File(path, fileName);
                try {
                    img.transferTo(file);
                    pathList.add(request.getContextPath() + "/file/" + fileName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        request.setAttribute("list", pathList);
        return "uploads";
    }

    @GetMapping("/download")
    public void download(String fileName, HttpServletRequest request, HttpServletResponse response) {
        if (fileName != null) {
            String path = request.getSession().getServletContext().getRealPath("file");
            File file = new File(path, fileName);
            OutputStream outputStream = null;
            if (file.exists()) {
                //设置下载文件
                response.setContentType("application/force-download");
                //设置文件名
                response.setHeader("Content-Disposition", "attachment;filename="+fileName);
                try {
                    outputStream = response.getOutputStream();
                    outputStream.write(FileUtils.readFileToByteArray(file));
                    outputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }

    }
}
