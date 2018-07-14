package com.wzj.web.dao;

/**
 * @author wzj
 * @create 2018-07-14 19:47
 **/
public interface TeacherDao
{
    /**
     * @param id 主键id
     * @return 名字
     */
    String queryName(int id);
}
