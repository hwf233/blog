package com.hwf.blog.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class blogTagController {
    @RequestMapping("/background/blogTagManage")
    public String goIndex(){
        return "background/blogTagManage";
    }
}
