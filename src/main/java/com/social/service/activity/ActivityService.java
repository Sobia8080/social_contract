package com.social.service.activity;

import com.social.entity.bean.activity.ActivityCategory;

import java.util.List;

/**
 * Created by liufangrui on 2018/4/13.
 */
public interface ActivityService {

    void insert(ActivityCategory bean);

    List<ActivityCategory> getAll();
}
