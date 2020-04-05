package com.hwf.blog.web.Controller;

import com.hwf.blog.model.User;
import com.hwf.blog.service.UserService;
import com.hwf.blog.utils.ConfigStrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class registerController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/background/register",method = RequestMethod.GET)
    public String goBackground(){
        return "background/register";
    }

    //判断用户名是否
    @ResponseBody
    @RequestMapping(value="/register",method = RequestMethod.GET)
    public String checkRegister(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        long result = userService.userRegister(username);
        if(result>0){
             return ConfigStrUtil.ERROR;
        }else {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setRole("user");
            userService.userInsert(user);
            return  ConfigStrUtil.SUCCESS;
        }
    }
}
