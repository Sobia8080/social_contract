package com.social.service.impl.activity;

import com.social.entity.bean.activity.ActivityCategory;
import com.social.mapper.activity.ActivityCategoryMapper;
import com.social.service.activity.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liufangrui on 2018/4/13.
 */
@Service("activityService")
public class ActivityServiceImpl implements ActivityService{

    @Autowired
    private ActivityCategoryMapper activityCategoryMapper;

    @Override
    public void insert(ActivityCategory bean) {
        activityCategoryMapper.insertSelective(bean);
    }

    @Override
    public List<ActivityCategory> getAll() {
        List<ActivityCategory> activityCategories = activityCategoryMapper.selectSelective(null);
        return activityCategories;
    }
}
