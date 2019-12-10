package com.example.service;

import com.example.service.bean.UserBean;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserBean> getUserList(Map<String, Object> map);
}
