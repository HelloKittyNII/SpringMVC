package com.wzj.web.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 返回页面
 * @author wzj
 * @create 2018-07-14 16:11
 **/
@Controller
public class PageTestController
{
    /**
     * 返回页面
     * @return index页面
     */
    @RequestMapping(value = "/")
    public String index()
    {
        return "index";
    }

    /**
     * 返回go页面
     * @return go页面
     */
    @RequestMapping(value = "/go")
    public String go()
    {
        return "go";
    }

}
