package com.wzj.web.controller.teacher;

import com.wzj.web.service.TeacherService;

import com.wzj.web.type.ResultInfo;
import com.wzj.web.type.ResultType;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wzj
 * @create 2018-07-14 18:29
 **/
@Controller
public class RestTeacherController
{
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(RestTeacherController.class);

    /**
     * 注入Teacher服务
     */
    @Autowired
    private TeacherService teacherService;

    /**
     * 提供界面控制器，传入id查询name
     * @param id id
     * @return name
     */
    @RequestMapping(value = "/teaName")
    @ResponseBody
    public ResultInfo<String> name(String id)
    {
        ResultInfo<String> resultInfo = new ResultInfo<String>();
        resultInfo.setStatus(ResultType.FAILURE.getStatus());

        if (StringUtils.isEmpty(id))
        {
            resultInfo.setMessage("id is empty");
            return resultInfo;
        }

        int teaId = 0;
        try
        {
            teaId = Integer.parseInt(id);
        }
        catch (Exception e)
        {
            LOGGER.error("id id not number.",e);
            resultInfo.setMessage("id id not number");
            return resultInfo;
        }

        resultInfo.setStatus(ResultType.SUCCESS.getStatus());
        String name = teacherService.getName(teaId);
        resultInfo.setData(name);
        return resultInfo;
    }
}
