package com.hwf.blog.service;

import com.hwf.blog.model.User;

import java.util.List;

public interface UserService {
      long checkUser(String username, String password);
      long userRegister(String username);
      void userInsert(User user);
}
