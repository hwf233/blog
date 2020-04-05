package com.hwf.blog.service.impl;
import com.hwf.blog.dao.UserMapper;
import com.hwf.blog.model.User;
import com.hwf.blog.model.UserExample;
import com.hwf.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public long userRegister(String username){
        ////根据用户名校验数据库中是否有该用户
        long result;
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        result = userMapper.countByExample(userExample);
        return result;
    }

    public void userInsert(User user) {
        //由封装的user对象将该新用户插入数据库
         userMapper.insert(user);
    }


    public long checkUser(String username,String password) {
        ////根据账号和密码判断是否存在该用户
        long result;
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        result = userMapper.countByExample(userExample);
        return  result;
    }
}
