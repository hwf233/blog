package com.hwf.blog.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    @RequestMapping("/foreground/blog")
    public String index(){
        return "foreground/blog";
    }
}
