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
import java.util.List;

@Controller
public class loginController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/background/index",method = RequestMethod.GET)
    public String goBackground(){
        return "background/index";
    }

//验证所输入账号密码是否与数据库信息一致
    @ResponseBody
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String checkUser(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        long result = userService.checkUser(username,password);
        if (result>0) {
            return ConfigStrUtil.SUCCESS;
        } else {
            return ConfigStrUtil.ERROR;
        }
    }

}
