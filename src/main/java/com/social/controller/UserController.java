package com.social.controller;

import com.social.entity.User;
import com.social.entity.bean.activity.ActivityCategory;
import com.social.service.UserService;
import com.social.service.activity.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by liufangrui on 2018/4/13.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private ActivityService activityService;

    @RequestMapping("index")
    public @ResponseBody User getUser(HttpServletRequest request,String name){
        User user = userService.getUser(name);
        return user;
    }
    @RequestMapping("getAll")
    @ResponseBody
    public List<ActivityCategory> getAll(HttpServletRequest request, String name){
        List<ActivityCategory> all = activityService.getAll();
        return all;
    }

}
