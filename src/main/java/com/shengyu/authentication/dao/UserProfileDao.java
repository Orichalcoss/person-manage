package com.shengyu.authentication.dao;

import com.shengyu.authentication.model.UserProfile;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserProfileDao {
    UserProfile getUserProfileByMobile(String mobile);

    int registerByMobile(UserProfile UserProfile);
}
