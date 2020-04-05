package com.hwf.blog.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TypeController {
    @RequestMapping("/foreground/types")
    public String type(){
        return "foreground/types";
    }
}
