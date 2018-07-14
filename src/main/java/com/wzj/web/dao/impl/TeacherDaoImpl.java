package com.wzj.web.dao.impl;

import com.wzj.web.dao.TeacherDao;
import com.wzj.web.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wzj
 * @create 2018-07-14 19:48
 **/
@Component
public class TeacherDaoImpl implements TeacherDao
{
    /**
     * teacher mapper
     */
    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * @param id 主键id
     * @return 名字
     */
    @Override
    public String queryName(int id)
    {
        return teacherMapper.getNameById(id);
    }
}
