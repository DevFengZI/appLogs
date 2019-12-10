package com.example.service;

import com.example.service.bean.UserBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<UserBean> getUserList(Map<String, Object> map) {
        List<UserBean> list = new ArrayList<>();
        UserBean userBean = new UserBean("lsf", "pw");
        list.add(userBean);
        return list;
    }
}
