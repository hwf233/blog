package com.hwf.blog.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
    @RequestMapping("/foreground/index")
    public String goIndex(){
        return "foreground/index";
    }
}