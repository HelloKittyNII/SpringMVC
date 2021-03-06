package com.wzj.web.service.impl;

import com.wzj.web.dao.TeacherDao;
import com.wzj.web.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * @author wzj
 * @create 2018-07-14 19:51
 **/
@Service
public class TeacherServiceImpl implements TeacherService
{
    /**
     * 注入teacher dao层
     */
    @Autowired
    private TeacherDao teacherDao;

    /**
     * 查询老师的名字
     *
     * @param id id信息
     * @return 名字
     */
    @Cacheable(value="cacheTest" )
    @Override
    public String getName(int id)
    {
        System.out.println("get name + " + new Date());
        return teacherDao.queryName(id);
    }


}
