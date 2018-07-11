package com.wzj.web.dao.impl;

import com.wzj.web.bean.User;
import com.wzj.web.dao.UserDao;
import com.wzj.web.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wzj on 2016/10/7.
 */
@Service
public class UserDaoImpl  implements UserDao
{
    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserById(int id)
    {
        return userMapper.findUserById(id);
    }


}
