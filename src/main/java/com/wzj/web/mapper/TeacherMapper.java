package com.wzj.web.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author wzj
 * @create 2018-07-14 21:00
 **/
@Component
public interface TeacherMapper
{
    /**
     * 通过id查找名字
     * @param id id
     * @return name
     */
    String getNameById(@Param("id") int id);
}
