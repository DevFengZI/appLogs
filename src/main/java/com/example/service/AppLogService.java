package com.example.service;

import com.example.service.bean.AppLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/applog")
public class AppLogService {
    String sql = "SELECT * from user_behavior WHERE month='8'";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/getall")
    public List<AppLog> getAppLogList() {
        List<AppLog> loglist = jdbcTemplate.queryForList(sql, AppLog.class);
        if (loglist != null) {
            return loglist;
        } else {
            return new ArrayList<>();
        }
    }

    @RequestMapping("/is")
    public String isok() {
        return "ok";
    }
}
