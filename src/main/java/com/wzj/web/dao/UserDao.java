package com.wzj.web.dao;

import com.wzj.web.bean.User;

/**
 * Created by wzj on 2016/10/7.
 */
public interface UserDao
{
    //根据用户id查询用户信息
    public User findUserById(int id);

}
