package com.social.controller.springBootDemo;

import com.social.entity.User;
import com.social.entity.bean.activity.ActivityCategory;
import com.social.service.UserService;
import com.social.service.activity.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by liufangrui on 2018/5/11.
 */
@RestController
@RequestMapping("/restDemo")
public class RestControllerDemo {

    @Autowired
    private UserService userService;
    @Autowired
    private ActivityService activityService;

    @RequestMapping(value = "getJson",produces = {"application/xml;charset=UTF-8"})
    public User getUser(HttpServletRequest request, String name){
        User user = userService.getUser(name);
        return user;
    }

    @RequestMapping("getAll")
    public List<ActivityCategory> getAll(){
        List<ActivityCategory> all = activityService.getAll();
        return all;
    }

    @RequestMapping(value = "getAll1",produces = {"application/json;charset=UTF-8"})
    public List<ActivityCategory> getAll1(){
        List<ActivityCategory> all = activityService.getAll();
        return all;
    }



}
