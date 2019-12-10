package com.example.controller;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/applog1")
public class UserServiceController {

//    @Autowired
//    UserService userService;
//
//    @RequestMapping("/getall")
//    public String getUserName(String str) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("lsf", str);
//        return userService.getUserList(map).get(0).passworld + "-app";
//    }

}
