package com.wzj.web.mapper;

import com.wzj.web.bean.User;
import org.springframework.stereotype.Service;

/**
 * 映射文件
 * Created by wzj on 2016/10/7.
 */
@Service
public interface UserMapper
{
    //根据用户id查询用户信息
    public User findUserById(int id);

}
