package com.wzj.web.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wzj
 * @create 2018-07-14 16:13
 **/
@Controller
public class RestTestController
{
    /**
     * 返回数据
     * @return 返回数据
     */
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello()
    {
        return "hello welcome";
    }
}
