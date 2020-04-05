package com.hwf.blog.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TagController {
    @RequestMapping("/foreground/tags")
    public String type(){
        return "foreground/tags";
    }
}
